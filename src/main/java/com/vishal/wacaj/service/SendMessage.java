package com.vishal.wacaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vishal.wacaj.config.Constants;
import com.vishal.wacaj.model.db.Customer;
import com.vishal.wacaj.model.message.Language;
import com.vishal.wacaj.model.message.Message;
import com.vishal.wacaj.model.message.Template;
import com.vishal.wacaj.model.security.User;
import com.vishal.wacaj.repository.CustomerRepository;

@Service
public class SendMessage {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();
    @Autowired
    CustomerRepository customerRepository;

    public String sendTemplateMessage(String recipientWaId, User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(user.getAccessToken());
        Message message = new Message();
        message.setMessagingProduct("whatsapp");
        message.setType("template");
        message.setTemplate(new Template());
        message.getTemplate().setName("hello_world");
        message.getTemplate().setLanguage(new Language());
        message.getTemplate().getLanguage().setCode("en_US");
        message.setTo(recipientWaId);
        HttpEntity<Message> requestEntity = new HttpEntity<>(message, httpHeaders);
        String url = String.format("https://graph.facebook.com/%s/%s/messages", Constants.VERSION,
                user.getFromPhoneNumberId());
        return (restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody());
    }

    // send message by customer category or to all customers
    public void sendMessageInBulk(String catergory, User user, Message message) {
        List<Customer> customerList;
        if (catergory != null)
            customerList = customerRepository.findByBusinessIdAndCustomerCategory(user.getBusinessId(), catergory);
        else
            customerList = customerRepository.findByBusinessId(user.getBusinessId());
        customerList.stream().forEach(customer -> sendTextMessage(customer.getRecipientWaId(), message, user));
    }

    // send message to a whatsapp id
    public void sendTextMessage(String recipientWaId,
            Message message, User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(user.getAccessToken());

        message.setTo(recipientWaId);
        HttpEntity<Message> requestEntity = new HttpEntity<>(message, httpHeaders);
        String url = String.format("https://graph.facebook.com/%s/%s/messages", Constants.VERSION,
                user.getFromPhoneNumberId());
        restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody();
    }
}

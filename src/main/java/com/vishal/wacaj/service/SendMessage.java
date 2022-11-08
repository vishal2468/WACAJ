package com.vishal.wacaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vishal.wacaj.config.Constants;
import com.vishal.wacaj.model.message.Language;
import com.vishal.wacaj.model.message.Message;
import com.vishal.wacaj.model.message.Template;
import com.vishal.wacaj.model.message.Text;
import com.vishal.wacaj.model.security.User;

@Service
public class SendMessage {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String sendTemplateMessage(String recipientWaId, User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(Constants.ACCESS_TOKEN);
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

    public String sendTextMessage(String recipientWaId,
            String messageString, User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(user.getAccessToken());

        Message message = new Message();
        message.setMessagingProduct("whatsapp");
        message.setRecipientType(Constants.RECEPIENT_INDIVIDUAL);
        message.setTo(recipientWaId);
        message.setType("text");
        message.setText(new Text());
        message.getText().setBody(messageString);
        message.getText().setPreviewUrl(false);
        HttpEntity<Message> requestEntity = new HttpEntity<>(message, httpHeaders);
        String url = String.format("https://graph.facebook.com/%s/%s/messages", Constants.VERSION,
                user.getFromPhoneNumberId());
        return (restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody());
    }
}

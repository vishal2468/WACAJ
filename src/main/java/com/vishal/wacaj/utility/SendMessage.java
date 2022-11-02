package com.vishal.wacaj.utility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.vishal.wacaj.model.message.Language;
import com.vishal.wacaj.model.message.Message;
import com.vishal.wacaj.model.message.Template;

public class SendMessage {
    @Autowired
    RestTemplate restTemplate=new RestTemplate();
    public String sendTemplateMessage(String messageString,String fromPhoneNumberId, String recipientWaId, boolean previewUrl,String authToken) {
        /*
         * Sends a text message to a WhatsApp user
         * Args:
         * message[str]: Message to be sent to the user
         * recipient_id[str]: Phone number of the user with country code wihout +
         * recipient_type[str]: Type of the recipient, either individual or group
         * preview_url[bool]: Whether to send a preview url or not
         * Example:
         * 
         * >>> from whatsapp import WhatsApp
         * >>> whatsapp = WhatsApp(token, phone_number_id)
         * >>> whatsapp.send_message("Hello World", "5511999999999")
         * >>> whatsapp.send_message("Hello World", "5511999999999", preview_url=False)
         */
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(authToken);

        Message message=new Message();
        message.setMessagingProduct("whatsapp");
        message.setType("template");
        message.setTemplate(new Template());
        message.getTemplate().setName("hello_world");
        message.getTemplate().setLanguage(new Language());
        message.getTemplate().getLanguage().setCode("en_US");
        message.setTo(recipientWaId);

        HttpEntity<Message> requestEntity=new HttpEntity<>(message,httpHeaders);
        String url=String.format("https://graph.facebook.com/v15.0/%s/messages", fromPhoneNumberId);
        return (restTemplate.exchange(url, HttpMethod.POST,requestEntity,String.class).getBody());
    }
}

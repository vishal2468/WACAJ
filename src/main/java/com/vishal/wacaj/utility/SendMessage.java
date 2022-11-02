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
import com.vishal.wacaj.model.message.Text;

public class SendMessage {
    @Autowired
    RestTemplate restTemplate=new RestTemplate();
    public String sendTemplateMessage(String fromPhoneNumberId, String recipientWaId,String authToken) {
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
    public String sendTextMessage(String fromPhoneNumberId, String recipientWaId,String recipientType ,String messageString,String authToken) {
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(authToken);

        Message message=new Message();
        message.setMessagingProduct("whatsapp");
        message.setRecipientType(recipientType);
        message.setTo(recipientWaId);
        message.setType("text");
        message.setText(new Text());
        message.getText().setBody(messageString);
        message.getText().setPreviewUrl(false);

        

        HttpEntity<Message> requestEntity=new HttpEntity<>(message,httpHeaders);
        String url=String.format("https://graph.facebook.com/v15.0/%s/messages", fromPhoneNumberId);
        return (restTemplate.exchange(url, HttpMethod.POST,requestEntity,String.class).getBody());
    }

}

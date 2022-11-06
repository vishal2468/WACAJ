package com.vishal.wacaj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vishal.wacaj.config.Constants;
import com.vishal.wacaj.model.message.Action;
import com.vishal.wacaj.model.message.Body;
import com.vishal.wacaj.model.message.Button;
import com.vishal.wacaj.model.message.Interactive;
import com.vishal.wacaj.model.message.Language;
import com.vishal.wacaj.model.message.Message;
import com.vishal.wacaj.model.message.Template;
import com.vishal.wacaj.model.message.Text;

@Service
public class SendMessage {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String sendTemplateMessage(String recipientWaId) {
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
                Constants.FROM_PHONE_NUMBER_ID);
        return (restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody());
    }

    public String sendTextMessage(String recipientWaId, String recipientType,
            String messageString) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(Constants.ACCESS_TOKEN);

        Message message = new Message();
        message.setMessagingProduct("whatsapp");
        message.setRecipientType(recipientType);
        message.setTo(recipientWaId);
        message.setType("text");
        message.setText(new Text());
        message.getText().setBody(messageString);
        message.getText().setPreviewUrl(false);
        HttpEntity<Message> requestEntity = new HttpEntity<>(message, httpHeaders);
        String url = String.format("https://graph.facebook.com/%s/%s/messages", Constants.VERSION,
                Constants.FROM_PHONE_NUMBER_ID);
        return (restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody());
    }
    public String sendInteractiveMessage(String recipientWaId, String recipientType,
            String messageString) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(Constants.ACCESS_TOKEN);

        Message message = new Message();
        message.setMessagingProduct("whatsapp");
        message.setRecipientType(recipientType);
        message.setTo(recipientWaId);
        message.setType("interactive");
        message.setInteractive(new Interactive());
        message.getInteractive().setType("button");
        message.getInteractive().setAction(new Action());
        Body body=new Body();
        body.setText(messageString);
        message.getInteractive().setBody(body);
        List<Button> buttons=new ArrayList<>();
        Button b1=new Button();
        Button b2=new Button();
        b1.setTitle("b1");
        b1.setId("b");
        b1.setType("reply");
        b2.setTitle("b2");
        b2.setId("bb");
        b2.setType("reply");
        buttons.add(b1);
        buttons.add(b2);
        message.getInteractive().getAction().setButton("button string 123");
        message.getInteractive().getAction().setButtons(buttons);
        HttpEntity<Message> requestEntity = new HttpEntity<>(message, httpHeaders);
        String url = String.format("https://graph.facebook.com/%s/%s/messages", Constants.VERSION,
                Constants.FROM_PHONE_NUMBER_ID);
        return (restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class).getBody());
    }

}

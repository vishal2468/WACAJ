package com.vishal.wacaj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.wacaj.model.webhook.Messages;
import com.vishal.wacaj.model.webhook.Payload;
import com.vishal.wacaj.model.webhook.Statuses;
import com.vishal.wacaj.service.SendMessage;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class WacajController {
    /**
     * @param payload
     * @return
     */
    @PostMapping("/webhooks")
    public Object handleIncomingMessages(@RequestBody Payload payload) {
        // todo
        // handle all the cases here for different types of webhook body
        String changedField=payload.getEntry().get(0).getChanges().get(0).getField();
        if(changedField.equals("messages")){
            List<Messages> newMessage=payload.getEntry().get(0).getChanges().get(0).getValue().getMessages();
            if(!newMessage.isEmpty()){// if not a new message then a status message
                String messageType=payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0).getType();
                switch(messageType){
                    case("text"):{
                        log.info("Message type is : text");
                        // take apt actions
                        return payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0);
                    }
                    case("button"):{
                        log.info("Message type is : button");
                        // return message
                        break;
                    }
                    case("document"):{
                        log.info("Message type is : document");
                        // return message
                        break;
                    }
                    case("image"):{
                        log.info("Message type is : image");
                        break;
                    }
                    case("interactive"):{
                        log.info("Message type is : interactive");
                        break;
                    }
                    case("order"):{
                        log.info("Message type is : order");
                        break;
                    }
                    case("sticker"):{
                        log.info("Message type is : sticker");
                        break;
                    }
                    case("video"):{
                        log.info("Message type is : video");
                        break;
                    }
                    case("system"):{
                        log.info("Message type is : system");
                        break;
                    }
                    case("unknown"):{
                        log.info("Message type is : unknown");
                        break;
                    }
                    default:{
                        log.info("Message is not of any predefined types");
                        break;
                    }
                }
                return payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0);
            }
            else{
                Statuses statuses=payload.getEntry().get(0).getChanges().get(0).getValue().getStatuses().get(0);
                String status=statuses.getStatus();
                log.info("Message" +status);
                return payload.getEntry().get(0).getChanges().get(0).getValue().getStatuses().get(0);
            }
        }
        return "not a message type";
    }

    @GetMapping("/webhooks")
    public int verificationRequest(@RequestParam("hub.verify_token") String verifyToken,
            @RequestParam("hub.mode") String mode, @RequestParam("hub.challenge") String challenge) {
        if (verifyToken.equals("meatyhamhock") && (mode.equals("subscribe")))
            return Integer.parseInt(challenge);
        return -1;
    }
    @GetMapping("/sendmessage/template")
    public String handleSendTemplateMessageRequest(){
        SendMessage sendMessage=new SendMessage();
        return sendMessage.sendTemplateMessage(  "918102988387");
    }
    @GetMapping("/sendmessage/text/{message}")
    public String handleSendTextMessageRequest(@PathVariable String message){
        SendMessage sendMessage=new SendMessage();
        return sendMessage.sendTextMessage( "918102988387","individual",message);
    }
}

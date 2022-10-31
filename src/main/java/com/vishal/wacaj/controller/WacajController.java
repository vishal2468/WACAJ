package com.vishal.wacaj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.wacaj.model.webhook.Messages;
import com.vishal.wacaj.model.webhook.Payload;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class WacajController {
    @PostMapping("/webhooks")
    public Messages hook(@RequestBody Payload payload) {
        // todo
        // handle all the cases here for different types of webhook body
        String changedField=payload.getEntry().get(0).getChanges().get(0).getField();
        if(changedField.equals("messages")){
            String messageType=payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0).getType();
            if(messageType.equals("text")){
                log.info("Message type is : text");
                // take apt actions
                return payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0);
            }
            else if(messageType.equals("button")){
                log.info("Message type is : button");
            }
            else if(messageType.equals("document")){
                log.info("Message type is : document");
            }
            else if(messageType.equals("image")){
                log.info("Message type is : image");
            }
            else if(messageType.equals("interactive")){
                log.info("Message type is : interactive");
            }
            else if(messageType.equals("order")){
                log.info("Message type is : order");
            }
            else if(messageType.equals("sticker")){
                log.info("Message type is : sticker");
            }
            else if(messageType.equals("video")){
                log.info("Message type is : video");
            }
            else if(messageType.equals("system")){
                log.info("Message type is : system");
            }
            else if(messageType.equals("unknown")){
                log.info("Message type is : unknown");
            }
            else{
                log.info("Message is not of any predefined types");
            }
        }
        return payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0);
    }

    @GetMapping("/webhooks")
    public int verificationRequest(@RequestParam("hub.verify_token") String verifyToken,
            @RequestParam("hub.mode") String mode, @RequestParam("hub.challenge") String challenge) {
        if (verifyToken.equals("meatyhamhock") && (mode.equals("subscribe")))
            return Integer.parseInt(challenge);
        return -1;
    }
}

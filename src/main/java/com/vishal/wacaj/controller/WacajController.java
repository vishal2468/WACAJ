package com.vishal.wacaj.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WacajController {
    @PostMapping("/webhooks")
    public String hook(@RequestBody Map<String, Object> payload) {
        // todo
        // handle all the cases here for different types of webhook body
        
        return payload.toString();
    }

    @GetMapping("/webhooks")
    public int verificationRequest(@RequestParam("hub.verify_token") String verifyToken,
            @RequestParam("hub.mode") String mode, @RequestParam("hub.challenge") String challenge) {
        if (verifyToken.equals("meatyhamhock") && (mode.equals("subscribe")))
            return Integer.parseInt(challenge);
        return -1;
    }
}

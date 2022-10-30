package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Statuses {
    Conversation conversation;
    String id;
    Pricing pricing;
    @JsonAlias("recepient_id")
    String recepientId;
    String status;
    String timestamp;
}

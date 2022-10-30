package com.vishal.wacaj.model.webhook;

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
    String recepientId;
    String status;
    String timestamp;
}

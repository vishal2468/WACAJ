package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class SystemMessage {
    String body;
    String identity;
    String newWaId;
    String waId;
    String type;
    String customer;
}

package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class SystemMessage {
    String body;
    String identity;
    @JsonAlias("new_wa_id")
    String newWaId;
    @JsonAlias("wa_id")
    String waId;
    String type;
    String customer;
}

package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class SystemMessage {
    String body;
    String identity;
    @JsonProperty("new_wa_id")
    String newWaId;
    @JsonProperty("wa_id")
    String waId;
    String type;
    String customer;
}

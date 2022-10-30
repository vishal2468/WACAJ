package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Interactive {
    String type;
    @JsonProperty("button_reply")
    ButtonReply buttonReply;
    @JsonProperty("list_reply")
    ListReply listReply;
}

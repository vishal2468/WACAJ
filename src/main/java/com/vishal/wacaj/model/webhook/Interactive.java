package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Interactive {
    String type;
    @JsonAlias("button_reply")
    ButtonReply buttonReply;
    @JsonAlias("list_reply")
    ListReply listReply;
}

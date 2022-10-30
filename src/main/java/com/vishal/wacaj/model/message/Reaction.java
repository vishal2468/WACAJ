package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Reaction {
    @JsonAlias("message_id")
    String messageId;
    String emoji;
}

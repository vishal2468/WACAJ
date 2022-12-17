package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Conversation {
    String id;
    Origin origin;
    @JsonProperty("expiration_timestamp")
    String expirationTimestamp;

}

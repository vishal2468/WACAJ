package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Metadata {
    @JsonProperty("display_phone_number")
    String displayPhoneNumber;
    @JsonProperty("phone_number_id")
    String phoneNumberId;
}

package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Metadata {
    @JsonAlias("display_phone_number")
    String displayPhoneNumber;
    @JsonAlias("phone_number_id")
    String phoneNumberId;
}

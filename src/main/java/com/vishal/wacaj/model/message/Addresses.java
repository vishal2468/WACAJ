package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Addresses {
    String street;
    String city;
    String state;
    String country;
    @JsonProperty("country_code")
    String countryCode;
    String type;
    String zip;
}

package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonAlias;

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
    @JsonAlias("country_code")
    String countryCode;
    String type;
    String zip;
}

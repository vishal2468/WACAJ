package com.vishal.wacaj.model.message;

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
    String countryCode;
    String type;
    String zip;
}

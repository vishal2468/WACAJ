package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Currency {
    @JsonAlias("fallback_value")
    String fallbackValue;
    String code;
    @JsonAlias("amount_1000")
    float amount1000;
}

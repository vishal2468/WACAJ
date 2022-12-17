package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Currency {
    @JsonProperty("fallback_value")
    String fallbackValue;
    String code;
    @JsonProperty("amount_1000")
    float amount1000;
}

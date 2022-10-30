package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Currency {
    String fallbackValue;
    String code;
    float amount1000;
}

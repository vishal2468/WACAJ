package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Pricing {
    String category;
    @JsonAlias("pricing_model")
    String pricingModel;
}

package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Context {
    boolean forwarded;
    @JsonProperty("frequently_forwarded")
    boolean frequentlyForwarded;
    String from;
    String id;
    @JsonProperty("referred_product")
    ReferredProduct referredProduct;
}

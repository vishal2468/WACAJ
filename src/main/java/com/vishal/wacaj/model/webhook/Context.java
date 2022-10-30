package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Context {
    boolean forwarded;
    @JsonAlias("frequently_forwarded")
    boolean frequentlyForwarded;
    String from;
    String id;
    @JsonAlias("referred_product")
    ReferredProduct referredProduct;
}

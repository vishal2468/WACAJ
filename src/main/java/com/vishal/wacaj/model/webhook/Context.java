package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Context {
    boolean forwarded;
    boolean frequentlyForwarded;
    String from;
    String id;
    ReferredProduct referredProduct;
}

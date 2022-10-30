package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ReferredProduct {
    @JsonAlias("catalog_id")
    String catalogId;
    @JsonAlias("product_ratailer_id")
    String productRetailerId;
}

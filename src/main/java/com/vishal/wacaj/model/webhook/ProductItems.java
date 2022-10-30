package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ProductItems {
    @JsonProperty("product_retailer_id")
    String productRetailerId;
    String quantity;
    @JsonProperty("item_price")
    String itemPrice;
    String currency;
}

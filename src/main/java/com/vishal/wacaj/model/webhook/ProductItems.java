package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ProductItems {
    @JsonAlias("product_retailer_id")
    String productRetailerId;
    String quantity;
    @JsonAlias("item_price")
    String itemPrice;
    String currency;
}

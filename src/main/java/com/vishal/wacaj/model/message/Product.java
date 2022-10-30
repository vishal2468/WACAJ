package com.vishal.wacaj.model.message;
import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Product {
    @JsonAlias("product_retailer_id")
    String productRetailerId;
}

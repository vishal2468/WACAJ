package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Order {
    @JsonProperty("catalog_id")
    String catalogId;
    String text;
    @JsonProperty("product_items")
    List<ProductItems> productItems=new ArrayList<>(); 
}

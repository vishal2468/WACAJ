package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Order {
    @JsonAlias("catalog_id")
    String catalogId;
    String text;
    @JsonAlias("product_items")
    List<ProductItems> productItems=new ArrayList<>(); 
}

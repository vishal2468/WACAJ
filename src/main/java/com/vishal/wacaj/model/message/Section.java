package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Section {
    @JsonProperty("product_items")
    List<Product> productItems=new ArrayList<>();
    List<Rows> rows=new ArrayList<>();
    String title;
}

package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Action {
    String button;
    List<Button> buttons=new ArrayList<>();
    @JsonAlias("catalog_id")
    String catalogId;
    @JsonAlias("product_retailer_id")
    String productRetailerId;
    List<Section> sections=new ArrayList<>();
    
}

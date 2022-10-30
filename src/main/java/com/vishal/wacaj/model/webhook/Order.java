package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;

public class Order {
    String catalogId;
    String text;
    List<ProductItems> productItems=new ArrayList<>(); 
}

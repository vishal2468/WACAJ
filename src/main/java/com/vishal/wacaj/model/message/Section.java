package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Section {
    List<Product> productItems=new ArrayList<>();
    List<Rows> rows=new ArrayList<>();
    String title;
}

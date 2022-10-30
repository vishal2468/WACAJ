package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Component {
    String type;
    String subType;
    List<Parameter> parameters=new ArrayList<>();
    int index;
}

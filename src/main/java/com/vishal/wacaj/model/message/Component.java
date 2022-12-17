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
public class Component {
    String type;
    @JsonProperty("sub_type")
    String subType;
    List<Parameter> parameters=new ArrayList<>();
    int index;
}

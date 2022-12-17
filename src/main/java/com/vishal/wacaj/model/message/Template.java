package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Template {
    String name;
    Language language;
    List<Component> components=new ArrayList<>();
}

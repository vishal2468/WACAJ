package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Template {
    String name;
    Language language;
    String namespace;
    List<Component> components=new ArrayList<>();
}

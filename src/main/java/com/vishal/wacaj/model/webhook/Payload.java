package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Payload {
    String object;
    List<Entry> entry=new ArrayList<>();
    
}

package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Interactive {
    Action action;
    Body body;
    Footer footer;
    Header header;
    String type;
}

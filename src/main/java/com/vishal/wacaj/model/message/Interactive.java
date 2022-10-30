package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interactive {
    Action action;
    Body body;
    Footer footer;
    Header header;
    Type type;
}

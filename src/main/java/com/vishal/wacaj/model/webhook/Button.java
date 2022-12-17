package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Button {
    String payload;
    String text;
}

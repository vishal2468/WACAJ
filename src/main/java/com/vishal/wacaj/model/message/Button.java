package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Button {
    String type;//only supports reply
    String title;
    String id;
}

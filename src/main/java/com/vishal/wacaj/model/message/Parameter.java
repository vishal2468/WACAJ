package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Parameter {
    String type;
    String text;
    Currency currency;
    DateTime dateTime;
    Media image;
    Media document;
    Media video;
}

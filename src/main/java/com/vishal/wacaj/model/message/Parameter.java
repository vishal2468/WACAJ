package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;

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

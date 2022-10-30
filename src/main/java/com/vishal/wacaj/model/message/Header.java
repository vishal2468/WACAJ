package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Header {
    Media document;
    Media image;
    String text;
    String type;
    Media video;
}

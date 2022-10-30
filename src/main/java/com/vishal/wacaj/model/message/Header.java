package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Header {
    Media document;
    Media image;
    String text;
    String type;
    Media video;
}

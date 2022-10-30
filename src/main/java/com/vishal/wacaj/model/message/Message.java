package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Message {
    Media audio;
    List<Contact> contacts=new ArrayList<>();
    Context context;
    Media document;
    Media image;
    Interactive interactive;
    Location location;
    String messagingProduct;
    boolean previewUrl;
    String recepientType;
    String status;
    Media sticker;
    Template template;
    Text text;
    String to;
    String type;
}

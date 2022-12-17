package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Messages {
    Audio audio;
    Button button;
    Context context;
    Document document;
    List<Errors> errors=new ArrayList<>();
    String from;
    String id;
    Identity identity;
    Image image;
    Interactive interactive;
    Order order;
    Referral referral;
    Sticker sticker;
    SystemMessage system;
    Text text;
    String timestamp;
    String type;
    Video video;
}

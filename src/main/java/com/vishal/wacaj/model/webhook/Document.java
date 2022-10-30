package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Document {
    String caption;
    String filename;
    String ha256;
    String mimeType;
    String id;
}

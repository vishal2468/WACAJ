package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

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
    @JsonAlias("mime_type")
    String mimeType;
    String id;
}

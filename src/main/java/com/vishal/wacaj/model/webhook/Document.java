package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty("mime_type")
    String mimeType;
    String id;
}

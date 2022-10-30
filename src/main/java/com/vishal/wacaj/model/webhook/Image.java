package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Image {
    String caption;
    String sha256;
    String id;
    @JsonProperty("mime_type")
    String mimeType;
}

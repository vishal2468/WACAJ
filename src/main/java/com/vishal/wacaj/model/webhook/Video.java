package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Video {
    String caption;
    String filename;
    String sha256;
    String id;
    @JsonAlias("mime_type")
    String mimeType;
}

package com.vishal.wacaj.model.webhook;

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
    String mimeType;
}

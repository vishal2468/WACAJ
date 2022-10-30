package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Sticker {
    String mime_type;
    String sha256;
    String id;
    boolean animated;
}

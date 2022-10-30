package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Referral {
    String sourceUrl;
    String sourceType;
    String sourceId;
    String headline;
    String body;
    String mediaType;
    String videoUrl;
    String thumbnailUrl;

}

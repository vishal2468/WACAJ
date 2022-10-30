package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Referral {
    @JsonAlias("source_url")
    String sourceUrl;
    @JsonAlias("source_type")
    String sourceType;
    @JsonAlias("source_id")
    String sourceId;
    String headline;
    String body;
    @JsonAlias("media_type")
    String mediaType;
    @JsonAlias("video_url")
    String videoUrl;
    @JsonAlias("thumbnail_url")
    String thumbnailUrl;

}

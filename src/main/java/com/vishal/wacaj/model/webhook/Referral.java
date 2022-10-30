package com.vishal.wacaj.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Referral {
    @JsonProperty("source_url")
    String sourceUrl;
    @JsonProperty("source_type")
    String sourceType;
    @JsonProperty("source_id")
    String sourceId;
    String headline;
    String body;
    @JsonProperty("media_type")
    String mediaType;
    @JsonProperty("video_url")
    String videoUrl;
    @JsonProperty("thumbnail_url")
    String thumbnailUrl;

}

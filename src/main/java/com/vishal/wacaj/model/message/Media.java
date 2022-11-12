package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Media {
    String id;
    String link;
    String caption;
    // String filename;  use only with a document media
}
package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Value {
    List<Contacts> contacts=new ArrayList<>();
    List<Errors> errors=new ArrayList<>();
    @JsonProperty("messaging_product")
    String messagingProduct;
    List<Messages> messages=new ArrayList<>();
    Metadata metadata;
    Statuses statuses;
}

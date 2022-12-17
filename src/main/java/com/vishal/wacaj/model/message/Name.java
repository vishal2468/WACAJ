package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Name {
    @JsonProperty("formatted_name")
    String formattedName;
    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("last_name")
    String lastName;
    @JsonProperty("middle_name")
    String middleName;
    String suffix;
    String prefix;
}

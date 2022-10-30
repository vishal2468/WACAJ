package com.vishal.wacaj.model.message;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Name {
    @JsonAlias("formatted_name")
    String formattedName;
    @JsonAlias("first_name")
    String firstName;
    @JsonAlias("last_name")
    String lastName;
    @JsonAlias("middle_name")
    String middleName;
    String suffix;
    String prefix;
}

package com.vishal.wacaj.model.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Name {
    String formattedName;
    String firstName;
    String lastName;
    String middleName;
    String suffix;
    String prefix;
}

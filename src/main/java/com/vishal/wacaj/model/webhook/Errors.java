package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Errors {
    String code;
    String title;
}

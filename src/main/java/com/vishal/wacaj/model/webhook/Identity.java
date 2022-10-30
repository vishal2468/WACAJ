package com.vishal.wacaj.model.webhook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Identity {
    String acknowledged;
    String customerIdentityChanged;
    String createdTimestamp;
    String hash;
}

package com.vishal.wacaj.model.security;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document
public class User {
    @Id
    private final int id;
    @Field("user_name")
    private final String userName;
    private final String password;
    private final boolean active;
    private final String roles;
    @Field("from_phone_number_id")
    private final String fromPhoneNumberId;
    @Field("access_token")
    private final String accessToken;
    @Field("business_name")
    private final String businessName;
    @Field("business_id")
    private final int businessId;

}

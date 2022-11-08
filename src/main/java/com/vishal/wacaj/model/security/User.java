package com.vishal.wacaj.model.security;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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

    @PersistenceCreator
    public User(int id, String userName, String password, boolean active, String roles, String fromPhoneNumberId,
            String accessToken) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.fromPhoneNumberId = fromPhoneNumberId;
        this.accessToken = accessToken;
    }

    public String getFromPhoneNumberId() {
        return fromPhoneNumberId;
    }

    public String getAccessToken() {
        return accessToken;
    }
    
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

}

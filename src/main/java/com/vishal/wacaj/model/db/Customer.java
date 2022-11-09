package com.vishal.wacaj.model.db;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public class Customer {
    @Field("recipient_wa_id")
    private String recipientWaId;
    @Field("customer_name")
    private String customerName;
    private String city;
    @Field("customer_category")
    private String customerCategory;
    @Field("business_id")
    private int businessId;
}

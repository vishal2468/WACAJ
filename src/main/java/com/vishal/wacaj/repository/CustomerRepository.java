package com.vishal.wacaj.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.wacaj.model.db.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String>{
    List<Customer> findByBusinessId(int businessId);

    List<Customer> findByBusinessIdAndCustomerCategory(int businessId, String customerCategory);

    List<Customer> findByBusinessIdAndIsOnboarded(int businessId, boolean b);

    Customer findByBusinessIdAndRecipientWaId(int businessId, String userid);

    List<Customer> findByBusinessIdAndCustomerCategoryAndIsOnboarded(int businessId, String customerCategory,
            Boolean onboarded);
}

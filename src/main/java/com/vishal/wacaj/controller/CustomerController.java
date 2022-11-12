package com.vishal.wacaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.wacaj.config.LoggedInUser;
import com.vishal.wacaj.model.db.Customer;
import com.vishal.wacaj.model.security.MyUserDetails;
import com.vishal.wacaj.repository.CustomerRepository;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomersByBusinessAndCategory(@LoggedInUser MyUserDetails userDetails,
            @RequestParam(value = "category", required = false) String customerCategory,
            @RequestParam(value = "onboarded", required = false) Boolean onboarded) {
        if (customerCategory == null && onboarded == null) {
            return customerRepository.findByBusinessId(userDetails.getUser().getBusinessId());
        } else if (customerCategory != null && onboarded != null) {
            return customerRepository.findByBusinessIdAndCustomerCategoryAndIsOnboarded(
                    userDetails.getUser().getBusinessId(), customerCategory, onboarded);
        } else if (customerCategory != null) {
            return customerRepository.findByBusinessIdAndCustomerCategory(userDetails.getUser().getBusinessId(),
                    customerCategory);
        } else {
            return customerRepository.findByBusinessIdAndIsOnboarded(userDetails.getUser().getBusinessId(), false);
        }
    }
}

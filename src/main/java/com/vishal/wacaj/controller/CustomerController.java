package com.vishal.wacaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.wacaj.config.LoggedInUser;
import com.vishal.wacaj.model.db.Customer;
import com.vishal.wacaj.model.security.MyUserDetails;
import com.vishal.wacaj.repository.CustomerRepository;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customer")
    public List<Customer> getCustomers(@LoggedInUser MyUserDetails userDetails){
        return customerRepository.findByBusinessId(userDetails.getUser().getBusinessId());
    }
    @GetMapping("/customer/{customerCategory}")
    public List<Customer> getCustomersByBusinessAndCategory(@LoggedInUser MyUserDetails userDetails,@PathVariable String customerCategory){
        return customerRepository.findByBusinessIdAndCustomerCategory(userDetails.getUser().getBusinessId(),customerCategory);
    }

}

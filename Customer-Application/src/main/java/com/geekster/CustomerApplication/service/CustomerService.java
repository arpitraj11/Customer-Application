package com.geekster.CustomerApplication.service;

import com.geekster.CustomerApplication.model.Customer;
import com.geekster.CustomerApplication.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    ICustomerRepo customerRepo;
    public String addCustomer(Customer customer) {
        customerRepo.save(customer);
        return "Customer added !!";
    }

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElseThrow();
    }

    public String deleteCustomer(Long id) {
        Customer existingCustomer = customerRepo.findById(id).orElseThrow(()-> new RuntimeException("Customer Not found"));
        customerRepo.deleteById(id);
        return "Customer deleted !!";

    }
    public String updateCustomer(Long id, String address) {
        Customer customer=customerRepo.findById(id).orElseThrow(()->new RuntimeException("id not found"));
        customer.setCustomeraddress(address);
        return "customer updated";
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();

    }
}

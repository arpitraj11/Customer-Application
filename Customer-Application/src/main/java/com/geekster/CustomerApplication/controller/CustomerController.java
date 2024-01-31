package com.geekster.CustomerApplication.controller;

import com.geekster.CustomerApplication.model.Customer;
import com.geekster.CustomerApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable Long id) {

        return customerService.deleteCustomer(id);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @PutMapping("/Customer/{id}/{address}")
    public String updateCustomer(@PathVariable Long id,@PathVariable String address){
        return customerService.updateCustomer(id,address);
    }
}

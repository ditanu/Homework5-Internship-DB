package com.tcv.homework5.controller;

import com.tcv.homework5.dto.CustomerDTO;
import com.tcv.homework5.model.Customer;
import com.tcv.homework5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable("id") Integer id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/filter")
    public List<Customer> getCustomersSorted() {
        return customerService.getCustomersSorted();
    }
}


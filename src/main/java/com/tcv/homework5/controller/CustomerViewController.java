package com.tcv.homework5.controller;

import com.tcv.homework5.dto.CustomerDTO;
import com.tcv.homework5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerViewController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "customers";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable(value = "id") Integer id, Model model) {
        CustomerDTO customer = customerService.getCustomerById(id);
        model.addAttribute("customerById", customer);
        return "customers";
    }

    @GetMapping("/filter")
    public String getCustomersSorted(Model model) {
        model.addAttribute("filterCustomers", customerService.getCustomersSorted());
        return "customers";
    }
}

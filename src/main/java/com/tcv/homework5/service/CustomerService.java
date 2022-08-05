package com.tcv.homework5.service;

import com.tcv.homework5.dto.CustomerDTO;
import com.tcv.homework5.mapper.CustomerMapper;
import com.tcv.homework5.model.Customer;
import com.tcv.homework5.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public List<CustomerDTO> getCustomers() {
        return customerRepository.findAll().stream().map(customerMapper::toCustomerDTO).collect(Collectors.toList());
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public CustomerDTO getCustomerById(Integer id) {
        return customerMapper.toCustomerDTO(customerRepository.findById(id).get());
    }

    public List<Customer> getCustomersSorted() {
        Sort sortASC = Sort.by(Sort.Direction.ASC, "username", "city", "country");
        return customerRepository.findAll(sortASC);
    }

}

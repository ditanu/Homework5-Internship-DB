package com.tcv.homework5.mapper;

import com.tcv.homework5.dto.CustomerDTO;
import com.tcv.homework5.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}

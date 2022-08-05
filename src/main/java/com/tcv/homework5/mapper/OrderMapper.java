package com.tcv.homework5.mapper;

import com.tcv.homework5.dto.OrderDTO;
import com.tcv.homework5.model.Orders;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toOrderDTO(Orders order);
}

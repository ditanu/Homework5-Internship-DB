package com.tcv.homework5.service;

import com.tcv.homework5.dto.OrderDTO;
import com.tcv.homework5.mapper.OrderMapper;
import com.tcv.homework5.model.Orders;
import com.tcv.homework5.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    private final OrderMapper orderMapper;

    public List<OrderDTO> getOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toOrderDTO)
                .collect(Collectors.toList());
    }

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    public Orders updateOrder(Orders order) {
        return orderRepository.save(order);
    }

    public OrderDTO getOrderById(Integer id) {
        return orderMapper.toOrderDTO(orderRepository.findById(id).get());
    }

}

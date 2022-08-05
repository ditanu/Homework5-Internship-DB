package com.tcv.homework5.controller;

import com.tcv.homework5.dto.OrderDTO;
import com.tcv.homework5.model.Orders;
import com.tcv.homework5.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public List<OrderDTO> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public Orders saveOrder(@RequestBody Orders order) {
        return orderService.saveOrder(order);
    }

    @PutMapping
    public Orders updateOrder(@RequestBody Orders order) {
        return orderService.updateOrder(order);
    }

    @GetMapping("/{id}")
    public OrderDTO getOrderById(@PathVariable("id") Integer id) {
        return orderService.getOrderById(id);
    }

}

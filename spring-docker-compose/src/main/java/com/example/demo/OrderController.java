package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @RequestMapping("/create")
    public Integer createOrder() {
        Order order = new Order();
        order.setGoods("goods");
        order.setStatus("created");
        return orderRepository.save(order).getId();
    }

    @RequestMapping("/list")
    public Iterable<Order> listOrders() {
        return orderRepository.findAll();
    }

    @RequestMapping("/cancel")
    public String cancelOrder() {
        Order order = new Order();
        order.setGoods("goods");
        orderRepository.delete(order);
        return "ok";
    }


}

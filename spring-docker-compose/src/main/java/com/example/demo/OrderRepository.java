package com.example.demo;

import org.springframework.data.repository.ListCrudRepository;


public interface OrderRepository extends ListCrudRepository<Order, Long> {


}

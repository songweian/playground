package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String goods;
    private String status;

}

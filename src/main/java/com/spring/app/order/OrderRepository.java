package com.spring.app.order;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(String id) {
        System.out.println("OrderRepository.save() gggg");
    }
}

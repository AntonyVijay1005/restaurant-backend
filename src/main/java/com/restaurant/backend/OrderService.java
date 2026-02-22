package com.restaurant.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public OrderEntity createOrder(OrderEntity orderEntity)
    {
        return orderRepo.save(orderEntity);
    }

}

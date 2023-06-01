package org.global.ecp.hackathon.app.order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.global.ecp.hackathon.app.email.EmailService;
import org.global.ecp.hackathon.app.order.model.Order;
import org.global.ecp.hackathon.app.order.model.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private EmailService emailService;

    // TODO - Task 9: implement this method
    public UUID createOrder(final OrderRequest orderRequest) {
        UUID randomId = UUID.randomUUID();
        LocalDateTime timeNow = LocalDateTime.now();

        if (orderRequest.getBasket().equals(null)) {
            return null;
        }

        Order newOrder = new Order(randomId, timeNow, orderRequest.getTotalCost(), orderRequest.getBasket().getBasketProducts());

        orderRepository.addOrder(newOrder);

        return randomId;
    }

    public List<Order> getAllOrders() {

        return orderRepository.getAll();
    }

    // TODO - Task 12: create a complete order method here
}

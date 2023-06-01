package org.global.ecp.hackathon.app.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.global.ecp.hackathon.app.order.model.Order;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class OrderRepository {

    private Map<UUID, Order> orders;

    public OrderRepository() {
        orders = new HashMap<>();
    }
    // TODO - Task 9: implement the map storage and add method in this file
    //  Ensure that the map is called "orders"

    public void addOrder(Order order) {
        orders.put(order.getId(), order);
        log.info("Order Created");
    }
    // TODO - Task 9: remove the return null
    //  uncomment the following line below once the orders map has been set up,
    //  this will be needed for Task 10
    public List<Order> getAll() {
        return orders.values().stream().toList();
    }

    // TODO - Task 12: implement the getById method here
}

package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.Orders;
import org.store.demo.model.User;
import org.store.demo.repository.OrdersRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/orders")
@Api(value = "Orders RESTful APIs")
public class OrdersController {

    private OrdersRepository ordersRepository;

    @Autowired

    public void OrdersRepository(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @ApiOperation(value = "Create a Order")
    @PostMapping
    //@ResponseStatus(CREATED)
    public Orders createOrder(@Valid @RequestBody Orders order) {
        Orders createdOrder = ordersRepository.save(order);
        return createdOrder;
    }
}

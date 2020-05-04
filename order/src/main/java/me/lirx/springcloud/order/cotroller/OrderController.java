package me.lirx.springcloud.order.cotroller;

import me.lirx.springcloud.order.entity.Order;
import me.lirx.springcloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("{id}")
    public Order queryOrderById(@PathVariable String id) {
        return orderService.queryOrderById(id);
    }
}

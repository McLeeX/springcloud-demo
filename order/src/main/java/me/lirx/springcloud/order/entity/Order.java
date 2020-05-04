package me.lirx.springcloud.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;
    private Long userId;
    private LocalDate createDate;
    private LocalDate updateDate;
    private List<OrderDetail> orderDetails;
}

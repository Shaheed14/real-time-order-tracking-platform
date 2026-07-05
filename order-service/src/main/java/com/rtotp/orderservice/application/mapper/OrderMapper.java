package com.rtotp.orderservice.application.mapper;

import com.rtotp.common.domain.OrderStatus;
import com.rtotp.orderservice.application.dto.CreateOrderRequest;
import com.rtotp.orderservice.application.dto.OrderResponse;
import com.rtotp.orderservice.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order toEntity(CreateOrderRequest request) {
        return Order.builder()
                .customerId(request.customerId())
                .restaurantId(request.restaurantId())
                .status(OrderStatus.CREATED)
                .build();
    }

    public OrderResponse toResponse(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getCustomerId(),
                order.getRestaurantId(),
                order.getStatus(),
                order.getCreatedAt(),
                order.getUpdatedAt()
        );
    }
}

package com.rtotp.orderservice.domain;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String getServiceStatus() {
        return "Order service is ready";
    }
}

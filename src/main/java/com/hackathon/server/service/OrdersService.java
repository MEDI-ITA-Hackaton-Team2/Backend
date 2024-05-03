package com.hackathon.server.service;

import com.hackathon.server.dto.OrderMemberRes;

public interface OrdersService {
    OrderMemberRes getOrder(Long orderId);
}

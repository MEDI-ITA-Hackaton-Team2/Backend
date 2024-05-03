package com.hackathon.server.service;

import com.hackathon.server.dto.GetOrderMemberResDto;

public interface OrdersService {
    GetOrderMemberResDto getOrder(Long orderId);
}

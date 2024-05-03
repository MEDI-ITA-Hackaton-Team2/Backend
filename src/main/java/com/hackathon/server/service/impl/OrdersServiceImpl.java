package com.hackathon.server.service.impl;

import com.hackathon.server.domain.OrderMember;
import com.hackathon.server.domain.Orders;
import com.hackathon.server.dto.GetOrderMemberResDto;
import com.hackathon.server.repository.OrderMemberRepository;
import com.hackathon.server.repository.OrdersRepository;
import com.hackathon.server.repository.UserRepository;
import com.hackathon.server.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;
    private final UserRepository userRepository;
    private final OrderMemberRepository orderMemberRepository;

    @Override
    public GetOrderMemberResDto getOrder(Long orderId) {

        Orders order =  ordersRepository.findById(orderId).get();

        GetOrderMemberResDto response = GetOrderMemberResDto.builder()
                .currentRecruit(orderMemberRepository.findByOrderOrderId(orderId).size())
                .totalRecruit(order.getRecruitNum())
                .userNmList(orderMemberRepository.findByOrderOrderId(orderId)
                        .stream()
                        .map(OrderMember::getUserId)
                        .map(userRepository::findById)
                        .map(user -> user.get().getUserName())
                        .toList())
                .build();

        return response;
    }
}

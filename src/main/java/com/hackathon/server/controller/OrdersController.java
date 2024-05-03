package com.hackathon.server.controller;

import com.hackathon.server.global.BaseResponse;
import com.hackathon.server.service.IngredientService;
import com.hackathon.server.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order")
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable Long orderId) {
        return ResponseEntity.ok(BaseResponse.of(HttpStatus.OK, "GET_ORDER_SUCCESS", ordersService.getOrder(orderId)));
    }
}

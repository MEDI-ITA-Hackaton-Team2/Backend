package com.hackathon.server.domain;

import com.hackathon.server.domain.type.OrderType;
import com.hackathon.server.domain.type.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String deliveryAddress;
    private String deliveryDongId;
    private Integer recruitNum;
    private Status orderStatus;
    private Long userId;
    private OrderType orderType;

    private LocalDateTime dueTime;

    private Long menuId;

    @Builder
    public Order(String deliveryAddress, String deliveryDongId, Integer recruitNum, Status orderStatus, Long userId, OrderType orderType, LocalDateTime dueTime, Long menuId) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryDongId = deliveryDongId;
        this.recruitNum = recruitNum;
        this.orderStatus = orderStatus;
        this.userId = userId;
        this.orderType = orderType;
        this.dueTime = dueTime;
        this.menuId = menuId;
    }
}

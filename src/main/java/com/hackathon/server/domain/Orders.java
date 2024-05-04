package com.hackathon.server.domain;

import com.hackathon.server.domain.type.OrderType;
import com.hackathon.server.domain.type.Status;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String deliveryAddress;
    private Long deliveryDongId;
    private Integer recruitNum;

    @Enumerated(EnumType.STRING)
    private Status orderStatus;

    private Long userId;

    @Enumerated(EnumType.STRING)
    private OrderType orderType;

    private LocalDateTime dueTime;

    private Long menuId;

    @Builder
    public Orders(String deliveryAddress, Long deliveryDongId, Integer recruitNum, Status orderStatus, Long userId, OrderType orderType, LocalDateTime dueTime, Long menuId) {
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

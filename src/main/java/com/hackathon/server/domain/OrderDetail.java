package com.hackathon.server.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;

    private Long ingredientId;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

    public OrderDetail(Long ingredientId, Order order) {
        this.ingredientId = ingredientId;
        this.order = order;
    }
}

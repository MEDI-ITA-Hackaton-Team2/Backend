package com.hackathon.server.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OrderMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderMemberId;

    private Long userId;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    @Builder
    public OrderMember(Orders order, Long userId) {
        this.order = order;
        this.userId = userId;
    }
}

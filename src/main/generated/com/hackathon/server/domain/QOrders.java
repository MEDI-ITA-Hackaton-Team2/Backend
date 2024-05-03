package com.hackathon.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrders is a Querydsl query type for Orders
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrders extends EntityPathBase<Orders> {

    private static final long serialVersionUID = -1529818004L;

    public static final QOrders orders = new QOrders("orders");

    public final StringPath deliveryAddress = createString("deliveryAddress");

    public final StringPath deliveryDongId = createString("deliveryDongId");

    public final DateTimePath<java.time.LocalDateTime> dueTime = createDateTime("dueTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> menuId = createNumber("menuId", Long.class);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final EnumPath<com.hackathon.server.domain.type.Status> orderStatus = createEnum("orderStatus", com.hackathon.server.domain.type.Status.class);

    public final EnumPath<com.hackathon.server.domain.type.OrderType> orderType = createEnum("orderType", com.hackathon.server.domain.type.OrderType.class);

    public final NumberPath<Integer> recruitNum = createNumber("recruitNum", Integer.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QOrders(String variable) {
        super(Orders.class, forVariable(variable));
    }

    public QOrders(Path<? extends Orders> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrders(PathMetadata metadata) {
        super(Orders.class, metadata);
    }

}


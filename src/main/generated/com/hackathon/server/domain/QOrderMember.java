package com.hackathon.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderMember is a Querydsl query type for OrderMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderMember extends EntityPathBase<OrderMember> {

    private static final long serialVersionUID = 499725921L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderMember orderMember = new QOrderMember("orderMember");

    public final QOrders order;

    public final NumberPath<Long> orderMemberId = createNumber("orderMemberId", Long.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QOrderMember(String variable) {
        this(OrderMember.class, forVariable(variable), INITS);
    }

    public QOrderMember(Path<? extends OrderMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderMember(PathMetadata metadata, PathInits inits) {
        this(OrderMember.class, metadata, inits);
    }

    public QOrderMember(Class<? extends OrderMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrders(forProperty("order")) : null;
    }

}


package com.hackathon.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDong is a Querydsl query type for Dong
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDong extends EntityPathBase<Dong> {

    private static final long serialVersionUID = 1611483851L;

    public static final QDong dong = new QDong("dong");

    public final NumberPath<Long> dongId = createNumber("dongId", Long.class);

    public final StringPath dongNm = createString("dongNm");

    public final StringPath gunGuNm = createString("gunGuNm");

    public final StringPath siDoNm = createString("siDoNm");

    public QDong(String variable) {
        super(Dong.class, forVariable(variable));
    }

    public QDong(Path<? extends Dong> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDong(PathMetadata metadata) {
        super(Dong.class, metadata);
    }

}


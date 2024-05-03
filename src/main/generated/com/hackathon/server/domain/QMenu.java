package com.hackathon.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = 1611742374L;

    public static final QMenu menu = new QMenu("menu");

    public final NumberPath<Long> menuId = createNumber("menuId", Long.class);

    public final StringPath menuImageURL = createString("menuImageURL");

    public final StringPath menuName = createString("menuName");

    public final NumberPath<Double> menuPrice = createNumber("menuPrice", Double.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QMenu(String variable) {
        super(Menu.class, forVariable(variable));
    }

    public QMenu(Path<? extends Menu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenu(PathMetadata metadata) {
        super(Menu.class, metadata);
    }

}


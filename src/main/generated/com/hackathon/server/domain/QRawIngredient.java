package com.hackathon.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRawIngredient is a Querydsl query type for RawIngredient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRawIngredient extends EntityPathBase<RawIngredient> {

    private static final long serialVersionUID = 1274547378L;

    public static final QRawIngredient rawIngredient = new QRawIngredient("rawIngredient");

    public final NumberPath<Long> ingredientId = createNumber("ingredientId", Long.class);

    public final StringPath ingredientImageURL = createString("ingredientImageURL");

    public final StringPath ingredientName = createString("ingredientName");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final StringPath quantity = createString("quantity");

    public QRawIngredient(String variable) {
        super(RawIngredient.class, forVariable(variable));
    }

    public QRawIngredient(Path<? extends RawIngredient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRawIngredient(PathMetadata metadata) {
        super(RawIngredient.class, metadata);
    }

}


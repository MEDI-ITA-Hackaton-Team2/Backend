package com.hackathon.server.repository.Impl;

import com.hackathon.server.dto.IngredientRes;
import com.hackathon.server.dto.MenuRes;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.hackathon.server.domain.QMenu.menu;
import static com.hackathon.server.domain.QOrders.orders;
import static com.hackathon.server.domain.QRecipe.recipe;
import static com.hackathon.server.domain.QOrderMember.orderMember;
import static com.hackathon.server.domain.QRawIngredient.rawIngredient;
import static com.querydsl.core.group.GroupBy.groupBy;

@Repository
@RequiredArgsConstructor
public class MenuRepositoryImpl implements MenuRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<MenuRes> selectMenuList(String menuNm, Long ingredientId, Long dongId, Double maxPrice) {
        BooleanBuilder builder = new BooleanBuilder();

        if(menuNm != null && !menuNm.isEmpty()) {
            builder.and(menu.menuName.eq(menuNm));
        }

        if(dongId != null) {
            builder.and(orders.deliveryDongId.eq(dongId));
        }

        if (maxPrice != null) {
            builder.and(menu.menuPrice.loe(maxPrice));
            builder.and(menu.menuPrice.gt(maxPrice - 10000));
        }

        return jpaQueryFactory.selectFrom(menu)
                .leftJoin(orders).on(menu.menuId.eq(orders.menuId))
                .leftJoin(recipe).on(menu.menuId.eq(recipe.menu.menuId))
                .where(builder)
                .orderBy(orders.dueTime.desc())
                .transform(groupBy(menu.menuId)
                        .list(Projections.constructor(
                                MenuRes.class,
                                menu,
                                orders,
                                ExpressionUtils.as(
                                        JPAExpressions.select(orderMember.count())
                                                .from(orderMember)
                                                .where(orderMember.order.orderId.eq(orders.orderId))
                                        , "currentRecruit")
                        )));

    }

    @Override
    public List<IngredientRes> selectMenuIngredientList(Long menuId) {

        return jpaQueryFactory.selectFrom(recipe)
                .leftJoin(rawIngredient).on(recipe.ingredientId.eq(rawIngredient.ingredientId))
                .where(recipe.menu.menuId.eq(menuId))
                .transform(groupBy(recipe.recipeId)
                        .list(Projections.constructor(
                                IngredientRes.class,
                                rawIngredient
                        )));
    }
}

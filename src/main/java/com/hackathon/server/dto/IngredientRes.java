package com.hackathon.server.dto;

import com.hackathon.server.domain.RawIngredient;
import lombok.Getter;

@Getter
public class IngredientRes {
    private final Long ingredientId;
    private final String ingredientName;
    private final String quantity;
    private final Double price;

    public IngredientRes(RawIngredient rawIngredient) {
        this.ingredientId = rawIngredient.getIngredientId();
        this.ingredientName = rawIngredient.getIngredientName();
        this.quantity = rawIngredient.getQuantity();
        this.price = rawIngredient.getPrice();
    }
}

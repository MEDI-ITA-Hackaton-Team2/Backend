package com.hackathon.server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MenuDetailRes {

    @Schema(name = "menuImageURL", example = "1")
    String menuImageURL;

    @Schema(name = "ingredients", example = "[{\"ingredientId\": 1, \"ingredientName\": \"양파\", \"ingredientImageURL\": \"https://image.com\", \"quantity\": \"1개\", \"price\": 1000}]")
    List<IngredientRes> ingredients;

    public MenuDetailRes(String menuImageURL, List<IngredientRes> ingredients) {
        this.menuImageURL = menuImageURL;
        this.ingredients = ingredients;
    }
}

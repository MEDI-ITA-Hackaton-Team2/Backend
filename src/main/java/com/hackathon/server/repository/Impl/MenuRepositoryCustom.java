package com.hackathon.server.repository.Impl;

import com.hackathon.server.dto.IngredientRes;
import com.hackathon.server.dto.MenuRes;

import java.util.List;

public interface MenuRepositoryCustom {
    List<MenuRes> selectMenuList(String menuNm, Long ingredientId, Long dongId, String sortType, Double maxPrice);

    List<IngredientRes> selectMenuIngredientList(Long menuId);
}

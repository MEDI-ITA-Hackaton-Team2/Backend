package com.hackathon.server.repository.Impl;

import com.hackathon.server.dto.MenuRes;

import java.util.List;

public interface MenuRepositoryCustom {
    List<MenuRes> selectMenuList(String menuNm, Long ingredientId, List<Long> dongIdList, String sortType, Double maxPrice);
}

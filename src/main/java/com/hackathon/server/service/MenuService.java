package com.hackathon.server.service;

import com.hackathon.server.dto.DongRes;
import com.hackathon.server.dto.MenuDetailRes;
import com.hackathon.server.dto.MenuRes;

import java.util.List;

public interface MenuService {

    List<DongRes> getDongList();

    List<MenuRes> getMenuList(String menuNm, Long ingredientId, List<Long> dongIdList, String sortType, Double maxPrice);

    MenuDetailRes getMenuDetail(Long menuId);

}

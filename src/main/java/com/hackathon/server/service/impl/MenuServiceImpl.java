package com.hackathon.server.service.impl;

import com.hackathon.server.domain.Dong;
import com.hackathon.server.dto.DongRes;
import com.hackathon.server.dto.MenuRes;
import com.hackathon.server.repository.DongRepository;
import com.hackathon.server.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final DongRepository dongRepository;

    @Override
    public List<DongRes> getDongList() {
        return dongRepository.selectAll();
    }

    @Override
    public List<MenuRes> getMenuList(String menuNm, Long ingredientId, List<Long> dongIdList, String sortType, Double maxPrice) {
        return null;
    }
}

package com.hackathon.server.service.impl;

import com.hackathon.server.domain.Dong;
import com.hackathon.server.domain.Menu;
import com.hackathon.server.dto.DongRes;
import com.hackathon.server.dto.MenuPostReq;
import com.hackathon.server.dto.MenuRes;
import com.hackathon.server.repository.DongRepository;
import com.hackathon.server.repository.MenuRepository;
import com.hackathon.server.repository.RawIngredientRepository;
import com.hackathon.server.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final DongRepository dongRepository;
    private final MenuRepository menuRepository;
    private final RawIngredientRepository rawIngredientRepository;

    @Override
    public List<DongRes> getDongList() {
        return dongRepository.selectAll();
    }

    @Override
    public List<MenuRes> getMenuList(String menuNm, Long ingredientId, List<Long> dongIdList, String sortType, Double maxPrice) {
        return null;
    }

    @Override
    public Integer saveMenu(MultipartFile file, MenuPostReq menuPostReq) {
        List<Long> ingredientList = menuPostReq.getIngredients();

        Double totalIngredientPrice = ingredientList.stream()
                .mapToDouble(ingredientId -> rawIngredientRepository.findById(ingredientId)
                        .map(ingredient -> ingredient.getPrice())
                        .orElse(0.0))
                .sum();

        Menu menu = new Menu(menuPostReq.getMenuNm(), file.getOriginalFilename(), menuPostReq.getUserId(), totalIngredientPrice);

        menuRepository.save(menu);

        return null;
    }
}

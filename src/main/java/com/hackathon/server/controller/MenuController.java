package com.hackathon.server.controller;

import com.hackathon.server.dto.MenuRes;
import com.hackathon.server.global.BaseResponse;
import com.hackathon.server.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/city/list")
    public ResponseEntity<?> getDongList() {
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuService.getDongList()));
    }

    @GetMapping("")
    public ResponseEntity<?> getMenuList(@RequestParam(required = false) String menuNm,
                                         @RequestParam(required = false) Long ingredientId,
                                         @RequestParam(required = false) List<Long> dongList,
                                         @RequestParam(required = false) String sortType,
                                         @RequestParam(required = false) Double maxPrice) {
        List<MenuRes> menuResList = menuService.getMenuList(menuNm, ingredientId, dongList, sortType, maxPrice);
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuResList));
    }
}

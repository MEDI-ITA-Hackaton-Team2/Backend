package com.hackathon.server.controller;

import com.hackathon.server.dto.MenuPostReq;
import com.hackathon.server.dto.MenuRes;
import com.hackathon.server.global.BaseResponse;
import com.hackathon.server.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/city/list")
    public ResponseEntity<?> getDongList() {
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuService.getDongList()));
    }


    @PostMapping(value = "" , consumes = {APPLICATION_JSON_VALUE, MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> saveMenu(@RequestPart(value = "menuImage") MultipartFile menuImage, @RequestPart(value = "menuInfo") MenuPostReq menuPostReq) {
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuService.saveMenu(menuImage, menuPostReq)));
    }
    
    @GetMapping("")
    public ResponseEntity<?> getMenuList(@RequestParam(required = false) String menuNm,
                                         @RequestParam(required = false) Long ingredientId,
                                         @RequestParam(required = false) Long dongNm,
                                         @RequestParam(required = false) String sortType,
                                         @RequestParam(required = false) Double maxPrice) {
        List<MenuRes> menuResList = menuService.getMenuList(menuNm, ingredientId, dongNm, maxPrice);
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuResList));
    }

    @GetMapping("/{menuId}")
    public ResponseEntity<?> getMenuDetail(@PathVariable Long menuId) {
        return ResponseEntity.ok(BaseResponse.ofSuccess(menuService.getMenuDetail(menuId)));

    }
}

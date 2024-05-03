package com.hackathon.server.controller;

import com.hackathon.server.global.BaseResponse;
import com.hackathon.server.service.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping("/")
    @Operation(summary = "원재료리스트 조회", description = "원재료 조희")
    public ResponseEntity<?> getIngredients(@RequestParam(required = false) String search,
                                            @RequestParam(required = false) List<Integer> dongNm) {
        return ResponseEntity.ok(BaseResponse.of(HttpStatus.OK, "GET_INGREDIENTS_SUCCESS", ingredientService.getIngredients(search, dongNm)));
    }

}

package com.hackathon.server.service;

import com.hackathon.server.domain.RawIngredient;
import com.hackathon.server.dto.IngredientRes;

import java.util.List;

public interface IngredientService {
    List<IngredientRes> getIngredients(String search, List<Integer> dongNm);
}

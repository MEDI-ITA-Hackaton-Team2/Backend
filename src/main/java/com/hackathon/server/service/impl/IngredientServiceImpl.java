package com.hackathon.server.service.impl;

import com.hackathon.server.domain.RawIngredient;
import com.hackathon.server.dto.IngredientRes;
import com.hackathon.server.repository.RawIngredientRepository;
import com.hackathon.server.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final RawIngredientRepository rawIngredientRepository;
    @Override
    public List<IngredientRes> getIngredients(String search, List<Integer> dongNm) {
        List<RawIngredient> ingredients = rawIngredientRepository.findAll();

        List<IngredientRes> response;

        if (search == null) {
            response = ingredients.stream()
                    .map(IngredientRes::new)
                    .toList();

            return response;
        } else if (dongNm == null) {
            response = ingredients.stream()
                    .filter(rawIngredient -> rawIngredient.getIngredientName().contains(search))
                    .map(IngredientRes::new)
                    .toList();
            return response;
        }

        //원재료에 동이름이 없어서 필터링을 못함
        response = ingredients.stream()
                .filter(rawIngredient -> rawIngredient.getIngredientName().contains(search))
                .map(IngredientRes::new)
                .toList();

        return response;

    }
}

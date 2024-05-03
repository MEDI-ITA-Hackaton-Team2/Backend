package com.hackathon.server.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;

    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private Menu menu;

    private Long ingredientId;

    @Builder
    public Recipe(Menu menu, Long ingredientId) {
        this.menu = menu;
        this.ingredientId = ingredientId;
    }
}

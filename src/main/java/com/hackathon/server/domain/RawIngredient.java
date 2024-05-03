package com.hackathon.server.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class RawIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;

    private String ingredientName;

    private String quantity;

    private Double price;

    private String ingredientImageURL;

    @Builder
    public RawIngredient(String ingredientName, String quantity, Double price) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.price = price;
    }
}

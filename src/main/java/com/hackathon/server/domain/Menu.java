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
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;

    private String menuName;

    private String menuImageURL;

    private Long userId;

    private Double menuPrice;

    @Builder
    public Menu(String menuName, String menuImageURL, Long userId, Double menuPrice) {
        this.menuName = menuName;
        this.menuImageURL = menuImageURL;
        this.userId = userId;
        this.menuPrice = menuPrice;
    }
}

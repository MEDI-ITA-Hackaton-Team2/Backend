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
public class Dong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dongId;

    private String siDoNm;

    private String gunGuNm;

    private String dongNm;

    @Builder
    public Dong(String siDoNm, String gunGuNm, String dongNm) {
        this.siDoNm = siDoNm;
        this.gunGuNm = gunGuNm;
        this.dongNm = dongNm;
    }
}

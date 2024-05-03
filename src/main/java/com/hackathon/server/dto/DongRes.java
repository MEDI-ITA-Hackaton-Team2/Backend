package com.hackathon.server.dto;

import com.hackathon.server.domain.Dong;
import lombok.Getter;

@Getter
public class DongRes {
    private final Long dongId;
    private final String siDoNm;
    private final String gunGuNm;
    private final String dongNm;

    public DongRes(Dong dong) {
        this.dongId = dong.getDongId();
        this.siDoNm = dong.getSiDoNm();
        this.gunGuNm = dong.getGunGuNm();
        this.dongNm = dong.getDongNm();
    }
}

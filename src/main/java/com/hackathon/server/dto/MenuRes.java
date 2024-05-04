package com.hackathon.server.dto;

import com.hackathon.server.domain.Menu;
import com.hackathon.server.domain.Orders;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class MenuRes {

    @Schema(name = "menuImgUrl", example = "asdfasdgdafds")
    String menuImgUrl;

    @Schema(name = "menuNm", example = "김치찌개")
    String menuNm;

    @Schema(name = "pricePerPerson", example = "10000")
    Double pricePerPerson;

    @Schema(name = "totalRecruit", example = "4")
    Integer totalRecruit;

    @Schema(name = "currentRecruit", example = "3")
    Integer currentRecruit;

    @Schema(name = "endAt", example = "2021-08-01T00:00:00")
    LocalDateTime endAt;

    public MenuRes(Menu menu, Orders order, int currentRecruit) {
        this.menuImgUrl = menu.getMenuImageURL();
        this.menuNm = menu.getMenuName();
        this.pricePerPerson = menu.getMenuPrice() / order.getRecruitNum();
        this.totalRecruit = order.getRecruitNum();
        this.currentRecruit = currentRecruit;
        this.endAt = order.getDueTime();
    }
}

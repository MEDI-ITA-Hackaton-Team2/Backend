package com.hackathon.server.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

public class GetMenusResDto {

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
}

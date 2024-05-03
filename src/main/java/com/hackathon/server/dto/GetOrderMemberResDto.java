package com.hackathon.server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.util.List;

@Getter
public class GetOrderMemberResDto {

    @Schema(name = "totalRecruit", example = "4")
    Integer totalRecruit;

    @Schema(name = "currentRecruit", example = "3")
    Integer currentRecruit;

    @Schema(name = "userNmList", example = "[\"user1\", \"user2\", \"user3\"]")
    List<String> userNmList;
}

package com.hackathon.server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class UserDto {
    @Schema(name = "userName", example = "user1")
    String userName;
    @Schema(name = "password", example = "asdfasdf")
    String password;
}

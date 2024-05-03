package com.hackathon.server.global.status;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum BaseExceptionResponseStatus {
    SUCCESS(HttpStatus.OK.value(), "요청에 성공하였습니다."),

    USERNAME_ALREADY_EXISTS(409, "이미 존재하는 사용자 아이디입니다."),
    INVALID_USER(404, "존재하지 않는 사용자입니다."),
    WRONG_PASSWORD(HttpStatus.UNAUTHORIZED.value(), "잘못된 비밀번호입니다."),
    ;

    private final int code;
    private final String message;

}

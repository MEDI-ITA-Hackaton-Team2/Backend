package com.hackathon.server.global;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hackathon.server.global.status.BaseExceptionResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@JsonPropertyOrder({"code", "message", "timestamp"})
@AllArgsConstructor
public class BaseExceptionResponse {

    private final int code;
    private final String message;

    public BaseExceptionResponse(BaseExceptionResponseStatus status) {
        this.code = status.getCode();
        this.message = status.getMessage();
    }
}


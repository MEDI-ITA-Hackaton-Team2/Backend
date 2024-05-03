package com.hackathon.server.global;

import lombok.Getter;

@Getter
public class CustomErrorException extends RuntimeException{
    private final BaseExceptionResponse errorResponse;
    public CustomErrorException(BaseExceptionResponse errorResponse){
        this.errorResponse = errorResponse;
    }
}

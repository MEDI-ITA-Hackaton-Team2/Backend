package com.hackathon.server.global;

import com.hackathon.server.global.status.BaseExceptionResponseStatus;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final BaseExceptionResponseStatus errorCode;
    public CustomException(BaseExceptionResponseStatus errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}

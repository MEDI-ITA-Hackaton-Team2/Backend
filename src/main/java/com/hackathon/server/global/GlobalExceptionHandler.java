package com.hackathon.server.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<BaseExceptionResponse> handleCustomException(CustomException ex) {
        BaseExceptionResponse response = new BaseExceptionResponse(ex.getErrorCode());
        return new ResponseEntity<>(response, HttpStatus.valueOf(ex.getErrorCode().getCode()));
    }

    @ExceptionHandler(CustomErrorException.class)
    public ResponseEntity<BaseExceptionResponse> handleCustomErrorException(CustomErrorException ex) {
        BaseExceptionResponse response = new BaseExceptionResponse(ex.getErrorResponse().getCode(), ex.getErrorResponse().getMessage());
        return new ResponseEntity<>(response, HttpStatus.valueOf(ex.getErrorResponse().getCode()));
    }
}

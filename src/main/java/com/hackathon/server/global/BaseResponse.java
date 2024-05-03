package com.hackathon.server.global;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonPropertyOrder({"code", "message", "result"})
public class BaseResponse<T> {

    private int code;

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private static final String SUCCESS = "Success";


    public static <T> BaseResponse<T> of(HttpStatus statusCode, String message, T data) {
        return new BaseResponse<>(statusCode.value(), message, data);
    }

    public static <T> BaseResponse<T> ofSuccess(T data){
        return new BaseResponse<>(HttpStatus.OK.value(), SUCCESS, data);
    }

    public static <T> BaseResponse<T> ofCreateSuccess(T data){
        return new BaseResponse<>(HttpStatus.CREATED.value(), SUCCESS, data);
    }
}

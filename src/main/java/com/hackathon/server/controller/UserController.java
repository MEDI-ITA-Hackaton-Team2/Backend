package com.hackathon.server.controller;

import com.hackathon.server.dto.UserDto;
import com.hackathon.server.global.BaseResponse;
import com.hackathon.server.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    @Operation(summary = "회원가입", description = "회원가입")
    public ResponseEntity<?> join(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(BaseResponse.ofCreateSuccess(userService.insertUser(userDto)));
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "로그인")
    public ResponseEntity<?> login(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(BaseResponse.of(HttpStatus.OK, "LOGIN_SUCCESS", userService.login(userDto)));
    }
}

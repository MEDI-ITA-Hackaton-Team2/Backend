package com.hackathon.server.service;

import com.hackathon.server.dto.UserDto;

public interface UserService {

    Long insertUser(UserDto userDto);

    void checkUserNameDuplication(String userName);

    Long login(UserDto userDto);
}

package com.hackathon.server.service.impl;

import com.hackathon.server.domain.User;
import com.hackathon.server.dto.UserDto;
import com.hackathon.server.global.CustomException;
import com.hackathon.server.global.status.BaseExceptionResponseStatus;
import com.hackathon.server.repository.UserRepository;
import com.hackathon.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public Long insertUser(UserDto userDto) {
        // username 중복 체크
        checkUserNameDuplication(userDto.getUserName());

        return userRepository.save(new User(userDto)).getUserId();
    }

    @Override
    public void checkUserNameDuplication(String userName) {
        Optional<User> user = userRepository.findByUserName(userName);

        if (user.isPresent()) {
            throw new CustomException(BaseExceptionResponseStatus.USERNAME_ALREADY_EXISTS);
        }
    }

    @Override
    public Long login(UserDto userDto) {
        User user = userRepository.findByUserName(userDto.getUserName())
                .orElseThrow(() -> new CustomException(BaseExceptionResponseStatus.INVALID_USER));

        if (!user.getPassword().equals(userDto.getPassword())) {
            throw new CustomException(BaseExceptionResponseStatus.WRONG_PASSWORD);
        }

        return user.getUserId();
    }

}

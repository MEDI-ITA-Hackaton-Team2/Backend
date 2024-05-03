package com.hackathon.server.domain;

import com.hackathon.server.dto.UserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;
    String userName;
    String password;

    public User(UserDto userDto) {
        this.userName = userDto.getUserName();
        this.password = userDto.getPassword();
    }
}

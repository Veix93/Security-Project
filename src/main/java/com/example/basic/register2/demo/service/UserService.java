package com.example.basic.register2.demo.service;

import com.example.basic.register2.demo.dto.UserDto;
import com.example.basic.register2.demo.entity.User;

import java.util.List;

public interface UserService {
    void  saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
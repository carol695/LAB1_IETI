package com.example.demo.service;

import com.example.demo.entity.User;

public interface UsersService {

    User createUser(User user);
    User readUser(String userId);
    User updateUser(String userId, User updatedUser);
    void deleteUser(String userId);
}

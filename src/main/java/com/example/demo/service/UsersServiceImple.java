package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UsersServiceImple implements UsersService {

    Map<String, User> users = new HashMap<>();

    @Override
    public User createUser(User user) {
        users.put(user.getUserId(), user);
        return user;
    }

    @Override
    public User readUser(String userId) {
        return users.get(userId);
    }

    @Override
    public User updateUser(String userId, User updatedUser) {
        if (users.containsKey(userId)) {
            updatedUser.setUserId(userId);
            users.put(userId, updatedUser);
            return updatedUser;
        }
        return null;
    }

    @Override
    public void deleteUser(String userId) {
        users.remove(userId);
    }
}

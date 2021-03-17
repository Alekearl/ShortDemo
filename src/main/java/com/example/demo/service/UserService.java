package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User getUserById(Long id);

    List<User> getAll();
}

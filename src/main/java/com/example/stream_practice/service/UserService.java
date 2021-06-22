package com.example.stream_practice.service;

import com.example.stream_practice.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    boolean delete(Long id);
}

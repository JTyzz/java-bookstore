package com.jasontyzzer.javabookstore.service;

import com.jasontyzzer.javabookstore.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    void delete(long id);
}
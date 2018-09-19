package com.gradletest.gradle.services;

import com.gradletest.gradle.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    String saveUser(User user);
    String update(User user);
    User findById(Integer id);
    void delete(Integer id);

}

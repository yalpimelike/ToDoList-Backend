package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    Optional<User> getUser(Long id);
    void deleteUser(Long id);
    User createUser(User user);
    User updateUser(User user);

}

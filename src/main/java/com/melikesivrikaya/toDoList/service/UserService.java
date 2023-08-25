package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.responce.UserResponce;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponce> getUsers();
    UserResponce getUser(Long id);
    void deleteUser(Long id);
    UserResponce createUser(User user);
    UserResponce updateUser(User user);

}

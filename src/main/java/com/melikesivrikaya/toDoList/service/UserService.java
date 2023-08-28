package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.responce.UserResponce;
import com.melikesivrikaya.toDoList.responce.UserWithFriendResponce;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponce> getUsers();
    UserWithFriendResponce getUser(Long id);
    void deleteUser(Long id);
    UserResponce createUser(User user);
    UserResponce updateUser(User user);

}

package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.responce.UserResponce;
import com.melikesivrikaya.toDoList.responce.UserWithFriendResponce;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface UserController {
    List<UserResponce> getUsers();
    UserWithFriendResponce getUser(Long id);
    void deleteUser(Long id);
    UserResponce createUser(User user);
    UserResponce updateUser(User user);


}

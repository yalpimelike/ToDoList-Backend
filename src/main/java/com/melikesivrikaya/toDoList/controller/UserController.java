package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.response.UserListWithFriendStateResponce;
import com.melikesivrikaya.toDoList.response.UserResponce;
import com.melikesivrikaya.toDoList.response.UserWithFriendResponce;

import java.util.List;

public interface UserController {
    List<UserResponce> getUsers();
    UserWithFriendResponce getUser(Long id);
    void deleteUser(Long id);
    UserResponce createUser(User user);
    UserResponce updateUser(User user);
    List<UserListWithFriendStateResponce> getUsersWitoutFriendByUserId(Long userId);

}

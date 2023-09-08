package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.response.UserListWithFriendStateResponce;
import com.melikesivrikaya.toDoList.response.UserResponce;
import com.melikesivrikaya.toDoList.response.UserWithFriendResponce;

import java.util.List;

public interface UserService {
    List<UserResponce> getUsers();
    UserWithFriendResponce getUserWithFriend(Long id);
    UserResponce getUserById(Long userId);
    void deleteUser(Long id);
    UserResponce createUser(User user);
    UserResponce updateUser(User user);

    List<UserListWithFriendStateResponce> getUsersWitoutFriendByUserId(Long userId);
}

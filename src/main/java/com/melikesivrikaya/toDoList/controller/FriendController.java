package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.Friend;

import java.util.List;
import java.util.Optional;

public interface FriendController {
    List<Friend> getFriends();
    Optional<Friend> getFriendById(Long id);
    Friend createFriend(Friend friend);
    Friend updateFriend(Friend friend);
    void deleteFriend(Long id);
}

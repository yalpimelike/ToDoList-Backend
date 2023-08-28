package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;

import java.util.List;
import java.util.Optional;

public interface FriendService {
    List<Friend> getFriends();
    Optional<Friend> getFriendById(Long id);
    Friend createFriend(Friend friend);
    Friend updateFriend(Friend friend);
    void deleteFriend(Long id);

}

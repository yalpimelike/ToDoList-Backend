package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.request.UpdateFriendRequest;

import java.util.List;
import java.util.Optional;

public interface FriendService {
    List<Friend> getFriends();
    Optional<Friend> getFriendById(Long id);
    Friend createFriend(Friend friend);
    Friend updateFriend( UpdateFriendRequest updateFriend);
    void deleteFriend(Long id);

    List<Friend> getFriendsByUserId(Long userId);

    List<Friend> getFriendsByFriendsId(Long friendId);
}

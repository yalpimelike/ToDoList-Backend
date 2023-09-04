package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.request.DeleteFriendByUserIdAndFriendIdRequest;
import com.melikesivrikaya.toDoList.request.UpdateFriendRequest;

import java.util.List;
import java.util.Optional;

public interface FriendController {
    List<Friend> getFriends();
    Optional<Friend> getFriendById(Long id);
    Friend createFriend(Friend friend);
    Friend updateFriend( UpdateFriendRequest updateFriend);
    void deleteFriend(Long id);
    List<Friend> getFriendsByUserId(Long userId);
    List<Friend> getFriendsByFriendId(Long friendId);
    void deleteFriendByUserIDAndFriendId(DeleteFriendByUserIdAndFriendIdRequest deleteFriend);
}

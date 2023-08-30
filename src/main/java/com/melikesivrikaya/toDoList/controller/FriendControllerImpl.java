package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.request.UpdateFriendRequest;
import com.melikesivrikaya.toDoList.service.FriendService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(path = "friends")
public class FriendControllerImpl implements FriendController{
    private FriendService friendService;
    @GetMapping
    @Override
    public List<Friend> getFriends() {
        return friendService.getFriends();
    }
    @GetMapping("/{id}")
    @Override
    public Optional<Friend> getFriendById(@PathVariable Long id) {
        return friendService.getFriendById(id);
    }
    @PostMapping
    @Override
    public Friend createFriend(@RequestBody Friend friend) {
        return friendService.createFriend(friend);
    }
    @PutMapping
    @Override
    public Friend updateFriend(@RequestBody UpdateFriendRequest updateFriend) {

        return friendService.updateFriend(updateFriend);
    }
    @DeleteMapping("/{id}")
    @Override
    public void deleteFriend(@PathVariable Long id) {
        friendService.deleteFriend(id);
    }
    @GetMapping("/friend")
    @Override
    public List<Friend> getFriendsByUserId(@RequestParam(name = "userId") Long userId) {
        return friendService.getFriendsByUserId(userId);
    }
    @GetMapping({"/friend/{friendId}"})
    @Override
    public List<Friend> getFriendsByFriendId(@PathVariable Long friendId){
        return friendService.getFriendsByFriendsId(friendId);
    }


}

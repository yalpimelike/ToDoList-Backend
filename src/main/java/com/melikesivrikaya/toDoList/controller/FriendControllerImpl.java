package com.melikesivrikaya.toDoList.controller;
import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.request.CreateFriendRequest;
import com.melikesivrikaya.toDoList.request.DeleteFriendByUserIdAndFriendIdRequest;
import com.melikesivrikaya.toDoList.request.UpdateFriendRequest;
import com.melikesivrikaya.toDoList.service.FriendService;
import lombok.AllArgsConstructor;
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
    @GetMapping("/{id}")
    @Override
    public Optional<Friend> getFriendById(@PathVariable Long id) {
        return friendService.getFriendById(id);
    }




    @PostMapping
    @Override
    public Friend createFriend(@RequestBody CreateFriendRequest createFriendRequest) {
        Friend friend = friendService.getFriendByUserIdAndFriendId(createFriendRequest.getUserId(), createFriendRequest.getFriendId());
        Friend friend1 = friendService.getFriendByUserIdAndFriendId(createFriendRequest.getFriendId(), createFriendRequest.getUserId());
        if(friend == null && friend1 == null){
            return friendService.createFriend(createFriendRequest);
        }
        return null;
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
    @DeleteMapping("/pair/{id}")
    @Override
    public void deleteFriendPair(@PathVariable Long id) {
        friendService.deleteFriendPair(id);
    }

    @DeleteMapping(path = "/friend")
    @Override
    public void deleteFriendByUserIDAndFriendId(@RequestBody DeleteFriendByUserIdAndFriendIdRequest deleteFriend){
        friendService.deleteFriendByUserIdAndFriendId(deleteFriend);
    }

}

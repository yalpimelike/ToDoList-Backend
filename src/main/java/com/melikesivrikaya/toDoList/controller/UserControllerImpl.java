package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.response.UserListWithFriendStateResponce;
import com.melikesivrikaya.toDoList.response.UserResponce;
import com.melikesivrikaya.toDoList.response.UserWithFriendResponce;
import com.melikesivrikaya.toDoList.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserControllerImpl implements UserController{
    private UserService userService;
    @GetMapping
    @Override
    public List<UserResponce> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/user/{userId}")
    @Override
    public UserResponce getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }
    @GetMapping(path = "user")
    @Override
    public UserWithFriendResponce getUserWithFriend(@RequestParam(name = "id") Long id){
        return userService.getUserWithFriend(id);
    }
    @GetMapping("{userId}")
    @Override
    public List<UserListWithFriendStateResponce> getUsersWitoutFriendByUserId(@PathVariable Long userId){
        return userService.getUsersWitoutFriendByUserId(userId);
    }


    @DeleteMapping(path = "user")
    @Override
    public void deleteUser(@RequestParam(name = "id") Long id) {
        userService.deleteUser(id);
    }
    @PostMapping
    @Override
    public UserResponce createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping
    @Override
    public UserResponce updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}

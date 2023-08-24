package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.service.UserService;
import com.melikesivrikaya.toDoList.service.UserServiceImpl;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
public class UserControllerImpl implements UserController{
    private UserService userService;
    @GetMapping(path = "users")
    @Override
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping(path = "user")
    @Override
    public Optional<User> getUser(@RequestParam(name = "id") Long id){
        return userService.getUser(id);
    }
}

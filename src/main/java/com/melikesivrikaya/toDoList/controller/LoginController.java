package com.melikesivrikaya.toDoList.controller;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.response.UserResponce;
import com.melikesivrikaya.toDoList.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {
    private final AuthenticationService authenticationService;

    @PostMapping
    public String login(@RequestBody User user){
        return authenticationService.register(user);
    }
}

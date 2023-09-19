package com.melikesivrikaya.toDoList.controller;
import com.melikesivrikaya.toDoList.request.AuthenticateRequest;
import com.melikesivrikaya.toDoList.request.RegisterRequest;
import com.melikesivrikaya.toDoList.response.AuthenticationResponce;
import com.melikesivrikaya.toDoList.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public AuthenticationResponce login(@RequestBody RegisterRequest request){
        return authenticationService.register(request);
    }
    @PostMapping("/authenticate")
    public AuthenticationResponce authenticate(@RequestBody AuthenticateRequest request){
        return authenticationService.authenticate(request);
    }
}

package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Role;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import com.melikesivrikaya.toDoList.request.RegisterRequest;
import com.melikesivrikaya.toDoList.response.AuthenticationResponce;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    public AuthenticationResponce register(RegisterRequest request){
        User registerUser = new User();
        registerUser.setName(request.getName());
        registerUser.setPassword(new BCryptPasswordEncoder().encode(request.getPassword()));
        registerUser.setRole(Role.USER);
        userRepository.save(registerUser);
        return new AuthenticationResponce(jwtService.generateToken(registerUser));
    }

    public String authenticate(User user) {

        return null;
    }
}

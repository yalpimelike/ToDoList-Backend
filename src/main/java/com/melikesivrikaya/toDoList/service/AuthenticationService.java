package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Role;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    public String register(User user){
        User registerUser = new User();
        registerUser.setName(user.getName());
        registerUser.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        registerUser.setRole(Role.USER);
        userRepository.save(registerUser);
        return jwtService.generateToken(registerUser);
    }
}

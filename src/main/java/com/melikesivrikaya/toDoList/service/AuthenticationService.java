package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Role;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import com.melikesivrikaya.toDoList.request.AuthenticateRequest;
import com.melikesivrikaya.toDoList.request.RegisterRequest;
import com.melikesivrikaya.toDoList.response.AuthenticationResponce;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.remote.JMXAuthenticator;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    public AuthenticationResponce register(RegisterRequest request){
        User registerUser = new User();
        registerUser.setName(request.getName());
        registerUser.setPassword(passwordEncoder.encode(request.getPassword()));
        registerUser.setRole(Role.USER);
        userRepository.save(registerUser);
        return new AuthenticationResponce(jwtService.generateToken(registerUser));
    }

    public AuthenticationResponce authenticate(AuthenticateRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getName() , request.getPassword())
        );
        UserDetails user = userRepository.findByName(request.getName());
        String jwtToken = jwtService.generateToken(user);
        return new AuthenticationResponce(jwtToken);
    }

}

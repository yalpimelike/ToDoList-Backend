package com.melikesivrikaya.toDoList.config;

import com.melikesivrikaya.toDoList.service.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        final String autHeader = request.getHeader("Authentication");
        if(autHeader == null || !autHeader.startsWith("Bearer")){
            filterChain.doFilter(request,response);
        }
        else{
            final String token = autHeader.substring(7);
            final String username ;

        }


    }
}

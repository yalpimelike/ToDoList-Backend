package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JwtService {
    // Token ile ilgili işlemler yapılacak
    private static final String SECRET_KEY = "aafeeba6959ebeeb96519d5dcf0bcc069f81e4bb56c246d04872db92666e6d4b";
    public String generateToken(UserDetails user){
        return generateToken(new HashMap<>() , user);
    }
    public String generateToken(Map<String,Object> extraClaims , UserDetails user){
        return Jwts.builder()
                .setSubject(user.getUsername())
                .setClaims(extraClaims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 24 * 60 ))
                .signWith(getSignKey(), SignatureAlgorithm.HS256 )
                .compact();
    }

    private Key getSignKey() {
        byte[] byteKeys = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(byteKeys);
    }
}

package com.cognizant.springlearn.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    // Generates a cryptographically secure 256-bit secret key at runtime
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String generateToken(String username) {
        long currentMillis = System.currentTimeMillis();
        
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(currentMillis))
                // Configures token validity lifespan parameter (e.g., 20 Minutes)
                .setExpiration(new Date(currentMillis + 1200000))
                .signWith(key)
                .compact();
    }
}
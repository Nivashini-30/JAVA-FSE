package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        logger.info("START - authenticate()");
        
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or Invalid Authorization Header");
        }

        // 1. Extract the Base64 payload string right after "Basic "
        String base64Credentials = authHeader.substring(6);
        
        // 2. Decode the bytes back into human-readable text
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        // 3. Split the decoded string by the colon separating username:password
        // credentials layout looks like -> "user:pwd"
        String[] values = credentials.split(":", 2);
        String username = values[0];
        String password = values[1];

        logger.info("Decoded User Credentials: username={}", username);

        // 4. For now, generate a token directly if credentials exist
        String token = jwtUtil.generateToken(username);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        logger.info("END - authenticate()");
        return response;
    }
}
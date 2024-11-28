package com.example.rbacui.service;

import com.example.rbacui.dto.LoginRequest;
import com.example.rbacui.dto.SignupRequest;
import com.example.rbacui.exception.InvalidCredentialsException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Value("${jwt.secret-key}")
    private String secretKey;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String registerUser(SignupRequest signupRequest) {
        String encryptedPassword = passwordEncoder.encode(signupRequest.getPassword());
        return "User registered successfully!";
    }

    public String loginUser(LoginRequest loginRequest) {
        // Validate user credentials (fetch from DB)
        String storedPassword = "storedPasswordFromDB";  // Replace with actual DB call

        if (!passwordEncoder.matches(loginRequest.getPassword(), storedPassword)) {
            throw new InvalidCredentialsException("Invalid credentials");
        }

        // Generate a JWT token on successful login
        return generateToken(loginRequest.getUsername());
    }

    private String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new java.util.Date())
                .setExpiration(new java.util.Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  // 10 hours expiration
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
}

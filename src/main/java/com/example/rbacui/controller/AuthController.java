package com.example.rbacui.controller;

import com.example.rbacui.dto.LoginRequest;
import com.example.rbacui.dto.SignupRequest;
import com.example.rbacui.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String registerUser(@RequestBody SignupRequest signupRequest) {
        return authService.registerUser(signupRequest);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest loginRequest) {
        return authService.loginUser(loginRequest);
    }
}

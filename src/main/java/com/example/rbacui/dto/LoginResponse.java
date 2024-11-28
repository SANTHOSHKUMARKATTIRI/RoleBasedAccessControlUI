package com.example.rbacui.dto;

public class LoginResponse {
    private String token;

    // Constructor, Getters, and Setters
    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

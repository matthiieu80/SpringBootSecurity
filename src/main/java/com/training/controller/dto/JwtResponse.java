package com.training.controller.dto;

import java.util.List;

public class JwtResponse {

    private String username;
    private String email;
    private List<String> roles;
    private String token;
    private Long id;

    public JwtResponse(String tokenGenerated, Long id, String username, String email, List<String> roles) {
        this.token = tokenGenerated;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public JwtResponse() {
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

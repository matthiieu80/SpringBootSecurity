package com.training.controller.dto;

import java.util.List;

public class JwtResponse {

    private String email;
    private List<String> roles;
    private String token;

    public JwtResponse(String tokenGenerated, String email, List<String> roles) {
        this.token = tokenGenerated;
        this.email = email;
        this.roles = roles;
    }

    public JwtResponse() {
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

}

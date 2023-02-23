package com.training.controller.dto;

import java.util.Set;

public class SigninDto {
    private String username;
    private String email;
    private String password;

      private Set role;


    public SigninDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Set getRole() {
        return role;
    }

    public void setRole(Set role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

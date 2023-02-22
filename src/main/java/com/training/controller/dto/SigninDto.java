package com.training.controller.dto;

import java.util.Set;

public class SigninDto {
    private String username;
    private String password;

      private Set role;


    public SigninDto() {
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

package com.training.controller.dto;

import java.util.Set;

public class SigninDto {
    private String email;
    private String password;



    public SigninDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.training.controller;

import com.training.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PrivateKey;
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class MailController {

    @Autowired
    private MailService notificationService;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private User user;

    @RequestMapping("/send-mail")
    public String sendMail() {
        user.setEmail("");
        try {

        }
    }


}

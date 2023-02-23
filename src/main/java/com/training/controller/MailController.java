//package com.training.controller;
//
//import com.training.repository.entity.User;
//import com.training.service.SendMail;
//import jakarta.mail.MessagingException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.mail.MailException;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.mail.javamail.JavaMailSender;
//
//
//import java.security.PrivateKey;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin("http://localhost:4200")
//public class MailController {
//
//    @Autowired
//    private SendMail notificationService;
//
//    @Autowired
//    private JavaMailSender javaMailSender;
//    @Autowired
//    private User user;
//
//    @RequestMapping("/send-mail")
//    public String sendMail() {
//        user.setEmail("");
//        try {
//            notificationService.sendMail(user);
//        } catch (MailException mailException) {
//            System.out.println(mailException);
//        }
//        return "Your mail has been send to the user.";
//    }
//    @RequestMapping("send-mail-attachment")
//    public String sendWithAttachment() throws MessagingException {
//        user.setEmail("receiver's email address");
//        try {
//            notificationService.sendMailWithAttachement(user);
//        } catch (MailException mailException) {
//            System.out.println(mailException);
//        }
//        return "Your mail has been send to the user.";
//    }
//}





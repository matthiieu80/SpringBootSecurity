package com.training.service;

import com.training.repository.entity.User;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;

public class SendMail {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail (User user) throws MailException{
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmail());
        mailMessage.setSubject("test mail");
        mailMessage.setText("message bien envoyé ");
        javaMailSender.send(mailMessage);
    }

    public void sendMailWithAttachement(User user) throws MailException, MessagingException, jakarta.mail.MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setTo(user.getEmail());
        helper.setSubject("test helper");
        helper.setText("test helper");

        ClassPathResource classPathResource = new ClassPathResource("test");
        helper.addAttachment (classPathResource.getFilename(),  classPathResource);
        javaMailSender.send(mimeMessage);


    }


}

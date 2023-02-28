package com.training;

import com.training.repository.UserRepository;
import com.training.repository.entity.Role;
import com.training.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.training.repository.entity.ERole.*;

@SpringBootApplication
public class BackendProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendProductApplication.class, args);
    }
    @Autowired
    public UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

/*   @Bean
    CommandLineRunner commandLineRunner( ){

        return args -> {
            Set<Role> roles = new HashSet<>();
            roles.add(new Role(ROLE_ADMIN));

            Set<Role> roles2 = new HashSet<>();
            roles.add(new Role(ROLE_USER));

            List<User> user = Arrays.asList(
                    new User("matt", "matthieu.comont1@gmail.com", encoder.encode("matt"), roles),
                    new User("matt2", "matthieu.comont2@gmail.com", encoder.encode("matt2"),roles2),
                    new User("matt3", "matthieu.comont3@gmail.com", encoder.encode("matt2"),roles),
                    new User("matt4", "matthieu.comont4@gmail.com", encoder.encode("matt2"),roles2)
                );

            userRepository.saveAll(user);
        };
    }*/
}



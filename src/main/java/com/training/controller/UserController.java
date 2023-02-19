package com.training.controller;




import com.training.repository.ProductRepository;
import com.training.repository.UserRepository;
import com.training.repository.entity.Product;
import com.training.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class UserController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("users")
    public ResponseEntity<List> fetchAll(){
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/add-user")
    public ResponseEntity<Void> createUser(@RequestBody User dto) {
        userRepository.save(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("{id}")
    public ResponseEntity<User> fetchById(@PathVariable("id") Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.get());

    }

//    @GetMapping("/products")
//    public ResponseEntity<List<User>> getAll() {
//        return ResponseEntity
//                .ok(userRepository.findAll());
//    }
//
//    @PostMapping("/products")
//    public ResponseEntity<Void> createProduct(@RequestBody User dto) {
//        userRepository.save(dto);
//
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .build();
//    }
}

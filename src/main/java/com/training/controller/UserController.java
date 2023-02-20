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
    @PostMapping("/user/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable("id") Long id){
        Optional<User> optionalContact = userRepository.findById(id);
        if (optionalContact.isPresent()) {
            User existingContact = optionalContact.get();
            userRepository.delete(existingContact);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long Id) {
//        Optional<User> user = userRepository.findById(Id);
//        if (user.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }
//        userRepository.delete(user.get());
//        return ResponseEntity.noContent().build();
//    }

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

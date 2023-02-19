package com.training.controller;

import com.training.repository.ProductRepository;
import com.training.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity
                .ok(productRepository.findAll());
    }

    @PostMapping("/products")
    public ResponseEntity<Void> createProduct(@RequestBody Product dto) {
        productRepository.save(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

}

package com.training;

import com.training.repository.ProductRepository;
import com.training.repository.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BackendProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendProductApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            List<Product> products = Arrays.asList(
                    new Product("Product #1", "Description #1", LocalDate.of(2023, 03, 01)),
                    new Product("Product #2", "Description #2", LocalDate.of(2023, 04, 02)),
                    new Product("Product #3", "Description #3", LocalDate.of(2023, 05, 03))
            );
            productRepository.saveAll(products);
        };
    }
}

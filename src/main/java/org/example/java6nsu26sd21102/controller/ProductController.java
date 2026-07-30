package org.example.java6nsu26sd21102.controller;

import lombok.RequiredArgsConstructor;
import org.example.java6nsu26sd21102.entity.Product;
import org.example.java6nsu26sd21102.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {

        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {

        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {

        return ResponseEntity.status(HttpStatus.CREATED).body(productService.add(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @RequestBody Product product,
            @PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(product, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }

}

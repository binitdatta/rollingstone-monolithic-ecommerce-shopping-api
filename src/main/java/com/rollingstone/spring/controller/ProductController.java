package com.rollingstone.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rollingstone.spring.model.Product;
import com.rollingstone.spring.service.ProductService;

@RestController
public class ProductController {

   @Autowired
   private ProductService  productService;

   /*---Add new Product---*/
   @PostMapping("/product")
   public ResponseEntity<?> save(@RequestBody Product product) {
      long id = productService.save(product);
      return ResponseEntity.ok().body("New Product has been saved with ID:" + id);
   }

   /*---Get a Product by id---*/
   @GetMapping("/product/{id}")
   public ResponseEntity<Product> get(@PathVariable("id") long id) {
	   Product product = productService.get(id);
      return ResponseEntity.ok().body(product);
   }

   /*---get all Categories---*/
   @GetMapping("/product")
   public ResponseEntity<List<Product>> list() {
      List<Product> categories = productService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Product by id---*/
   @PutMapping("/product/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Product product) {
      productService.update(id, product);
      return ResponseEntity.ok().body("Product has been updated successfully.");
   }

   /*---Delete a Product by id---*/
   @DeleteMapping("/product/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      productService.delete(id);
      return ResponseEntity.ok().body("Product has been deleted successfully.");
   }
}
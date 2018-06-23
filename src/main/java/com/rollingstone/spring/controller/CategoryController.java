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

import com.rollingstone.spring.model.Category;
import com.rollingstone.spring.service.CategoryService;

@RestController
public class CategoryController {

   @Autowired
   private CategoryService categoryService;

   /*---Add new Category---*/
   @PostMapping("/category")
   public ResponseEntity<?> save(@RequestBody Category category) {
      long id = categoryService.save(category);
      return ResponseEntity.ok().body("New Catrgory has been saved with ID:" + id);
   }

   /*---Get a Category by id---*/
   @GetMapping("/category/{id}")
   public ResponseEntity<Category> get(@PathVariable("id") long id) {
	   Category category = categoryService.get(id);
      return ResponseEntity.ok().body(category);
   }

   /*---get all Categories---*/
   @GetMapping("/category")
   public ResponseEntity<List<Category>> list() {
      List<Category> categories = categoryService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Category by id---*/
   @PutMapping("/category/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Category category) {
      categoryService.update(id, category);
      return ResponseEntity.ok().body("Category has been updated successfully.");
   }

   /*---Delete a Category by id---*/
   @DeleteMapping("/category/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      categoryService.delete(id);
      return ResponseEntity.ok().body("Category has been deleted successfully.");
   }
}
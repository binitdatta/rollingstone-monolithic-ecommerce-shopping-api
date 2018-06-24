package com.rollingstone.spring.controller;

import java.util.ArrayList;
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

import com.rollingstone.spring.model.Cart;
import com.rollingstone.spring.service.CartService;

@RestController
public class CartController {

   @Autowired
   private CartService cartService;

   /*---Add new Cart---*/
   @PostMapping("/cart")
   public ResponseEntity<?> save(@RequestBody Cart cart) {
      long id = cartService.save(cart);
      return ResponseEntity.ok().body("New Cart has been saved with ID:" + id);
   }

   /*---Get a Cart by id---*/
   @GetMapping("/cart/{id}")
   public ResponseEntity<Cart> get(@PathVariable("id") long id) {
	   Cart cart = cartService.get(id);
	   return ResponseEntity.ok().body(cart);
   }

   /*---get all Carts---*/
   @GetMapping("/cart")
   public ResponseEntity<List<Cart>> list() {
      List<Cart> carts = cartService.list();
      return ResponseEntity.ok().body(carts);
   }

   /*---Update a Cart by id---*/
   @PutMapping("/cart/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Cart cart) {
      cartService.update(id, cart);
      return ResponseEntity.ok().body("Cart has been updated successfully.");
   }

   /*---Delete a Cart by id---*/
   @DeleteMapping("/cart/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      cartService.delete(id);
      return ResponseEntity.ok().body("Cart has been deleted successfully.");
   }
}
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

import com.rollingstone.spring.model.CartItem;
import com.rollingstone.spring.service.CartItemService;

@RestController
public class CartItemController {

   @Autowired
   private CartItemService cartItemService;

   /*---Add new CartItem---*/
   @PostMapping("/cartitem")
   public ResponseEntity<?> save(@RequestBody CartItem cart) {
      long id = cartItemService.save(cart);
      return ResponseEntity.ok().body("New CartItem has been saved with ID:" + id);
   }

   /*---Get a CartItem by id---*/
   @GetMapping("/cartitem/{id}")
   public ResponseEntity<CartItem> get(@PathVariable("id") long id) {
	   CartItem cart = cartItemService.get(id);
	   return ResponseEntity.ok().body(cart);
   }

   /*---get all CartItems---*/
   @GetMapping("/cartitem")
   public ResponseEntity<List<CartItem>> list() {
      List<CartItem> carts = cartItemService.list();
      return ResponseEntity.ok().body(carts);
   }

   /*---Update a CartItem by id---*/
   @PutMapping("/cartitem/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody CartItem cart) {
      cartItemService.update(id, cart);
      return ResponseEntity.ok().body("CartItem has been updated successfully.");
   }

   /*---Delete a CartItem by id---*/
   @DeleteMapping("/cartitem/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      cartItemService.delete(id);
      return ResponseEntity.ok().body("CartItem has been deleted successfully.");
   }
}
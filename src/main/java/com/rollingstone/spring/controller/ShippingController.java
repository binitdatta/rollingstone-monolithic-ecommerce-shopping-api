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

import com.rollingstone.spring.model.Shipping;
import com.rollingstone.spring.service.ShippingService;

@RestController
public class ShippingController {

   @Autowired
   private ShippingService shippingService;

   /*---Add new Shipping---*/
   @PostMapping("/shipping")
   public ResponseEntity<?> save(@RequestBody Shipping shipping) {
      long id = shippingService.save(shipping);
      return ResponseEntity.ok().body("New Shipping has been saved with ID:" + id);
   }

   /*---Get a Shipping by id---*/
   @GetMapping("/shipping/{id}")
   public ResponseEntity<Shipping> get(@PathVariable("id") long id) {
	   Shipping shipping = shippingService.get(id);
      return ResponseEntity.ok().body(shipping);
   }

   /*---get all Categories---*/
   @GetMapping("/shipping")
   public ResponseEntity<List<Shipping>> list() {
      List<Shipping> categories = shippingService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Shipping by id---*/
   @PutMapping("/shipping/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Shipping shipping) {
      shippingService.update(id, shipping);
      return ResponseEntity.ok().body("Shipping has been updated successfully.");
   }

   /*---Delete a Shipping by id---*/
   @DeleteMapping("/shipping/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      shippingService.delete(id);
      return ResponseEntity.ok().body("Shipping has been deleted successfully.");
   }
}
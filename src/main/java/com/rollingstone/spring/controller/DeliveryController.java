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

import com.rollingstone.spring.model.Delivery;
import com.rollingstone.spring.service.DeliveryService;

@RestController
public class DeliveryController {

   @Autowired
   private DeliveryService deliveryService;

   /*---Add new Delivery---*/
   @PostMapping("/delivery")
   public ResponseEntity<?> save(@RequestBody Delivery delivery) {
      long id = deliveryService.save(delivery);
      return ResponseEntity.ok().body("New Catrgory has been saved with ID:" + id);
   }

   /*---Get a Delivery by id---*/
   @GetMapping("/delivery/{id}")
   public ResponseEntity<Delivery> get(@PathVariable("id") long id) {
	   Delivery delivery = deliveryService.get(id);
      return ResponseEntity.ok().body(delivery);
   }

   /*---get all Categories---*/
   @GetMapping("/delivery")
   public ResponseEntity<List<Delivery>> list() {
      List<Delivery> categories = deliveryService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Delivery by id---*/
   @PutMapping("/delivery/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Delivery delivery) {
      deliveryService.update(id, delivery);
      return ResponseEntity.ok().body("Delivery has been updated successfully.");
   }

   /*---Delete a Delivery by id---*/
   @DeleteMapping("/delivery/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      deliveryService.delete(id);
      return ResponseEntity.ok().body("Delivery has been deleted successfully.");
   }
}
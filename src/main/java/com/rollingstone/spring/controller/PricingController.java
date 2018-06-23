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

import com.rollingstone.spring.model.Pricing;
import com.rollingstone.spring.service.PricingService;

@RestController
public class PricingController {

   @Autowired
   private PricingService pricingService;

   /*---Add new Pricing---*/
   @PostMapping("/pricing")
   public ResponseEntity<?> save(@RequestBody Pricing pricing) {
      long id = pricingService.save(pricing);
      return ResponseEntity.ok().body("New Catrgory has been saved with ID:" + id);
   }

   /*---Get a Pricing by id---*/
   @GetMapping("/pricing/{id}")
   public ResponseEntity<Pricing> get(@PathVariable("id") long id) {
	   Pricing pricing = pricingService.get(id);
      return ResponseEntity.ok().body(pricing);
   }

   /*---get all Pricing---*/
   @GetMapping("/pricing")
   public ResponseEntity<List<Pricing>> list() {
      List<Pricing> categories = pricingService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Pricing by id---*/
   @PutMapping("/pricing/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Pricing pricing) {
      pricingService.update(id, pricing);
      return ResponseEntity.ok().body("Pricing has been updated successfully.");
   }

   /*---Delete a Pricing by id---*/
   @DeleteMapping("/pricing/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      pricingService.delete(id);
      return ResponseEntity.ok().body("Pricing has been deleted successfully.");
   }
}
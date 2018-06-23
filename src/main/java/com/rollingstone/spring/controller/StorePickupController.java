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

import com.rollingstone.spring.model.StorePickup;
import com.rollingstone.spring.service.StorePickupService;

@RestController
public class StorePickupController {

   @Autowired
   private StorePickupService storePickupService;

   /*---Add new StorePickup---*/
   @PostMapping("/storePickup")
   public ResponseEntity<?> save(@RequestBody StorePickup storePickup) {
      long id = storePickupService.save(storePickup);
      return ResponseEntity.ok().body("New SPU has been saved with ID:" + id);
   }

   /*---Get a StorePickup by id---*/
   @GetMapping("/storePickup/{id}")
   public ResponseEntity<StorePickup> get(@PathVariable("id") long id) {
	   StorePickup storePickup = storePickupService.get(id);
      return ResponseEntity.ok().body(storePickup);
   }

   /*---get all Categories---*/
   @GetMapping("/storePickup")
   public ResponseEntity<List<StorePickup>> list() {
      List<StorePickup> categories = storePickupService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a StorePickup by id---*/
   @PutMapping("/storePickup/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody StorePickup storePickup) {
      storePickupService.update(id, storePickup);
      return ResponseEntity.ok().body("StorePickup has been updated successfully.");
   }

   /*---Delete a StorePickup by id---*/
   @DeleteMapping("/storePickup/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      storePickupService.delete(id);
      return ResponseEntity.ok().body("StorePickup has been deleted successfully.");
   }
}
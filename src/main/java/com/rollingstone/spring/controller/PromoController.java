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

import com.rollingstone.spring.model.Promo;
import com.rollingstone.spring.service.PromoService;

@RestController
public class PromoController {

   @Autowired
   private PromoService promoService;

   /*---Add new Promo---*/
   @PostMapping("/promo")
   public ResponseEntity<?> save(@RequestBody Promo promo) {
      long id = promoService.save(promo);
      return ResponseEntity.ok().body("New Catrgory has been saved with ID:" + id);
   }

   /*---Get a Promo by id---*/
   @GetMapping("/promo/{id}")
   public ResponseEntity<Promo> get(@PathVariable("id") long id) {
	   Promo promo = promoService.get(id);
      return ResponseEntity.ok().body(promo);
   }

   /*---get all Categories---*/
   @GetMapping("/promo")
   public ResponseEntity<List<Promo>> list() {
      List<Promo> categories = promoService.list();
      return ResponseEntity.ok().body(categories);
   }

   /*---Update a Promo by id---*/
   @PutMapping("/promo/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Promo promo) {
      promoService.update(id, promo);
      return ResponseEntity.ok().body("Promo has been updated successfully.");
   }

   /*---Delete a Promo by id---*/
   @DeleteMapping("/promo/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      promoService.delete(id);
      return ResponseEntity.ok().body("Promo has been deleted successfully.");
   }
}
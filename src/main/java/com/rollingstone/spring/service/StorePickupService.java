package com.rollingstone.spring.service;

import java.util.List;

import com.rollingstone.spring.model.StorePickup;

public interface StorePickupService {

   long save(StorePickup category);
   StorePickup get(long id);
   List<StorePickup> list();
   void update(long id, StorePickup category);
   void delete(long id);
}

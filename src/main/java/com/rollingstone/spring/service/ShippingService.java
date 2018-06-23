package com.rollingstone.spring.service;

import java.util.List;

import com.rollingstone.spring.model.Shipping;

public interface ShippingService {

   long save(Shipping shipping);
   Shipping get(long id);
   List<Shipping> list();
   void update(long id, Shipping shipping);
   void delete(long id);
}

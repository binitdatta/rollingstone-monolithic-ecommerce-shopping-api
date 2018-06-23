package com.rollingstone.spring.service;

import java.util.List;

import com.rollingstone.spring.model.Pricing;

public interface PricingService {

   long save(Pricing pricing);
   Pricing get(long id);
   List<Pricing> list();
   void update(long id, Pricing pricing);
   void delete(long id);
}

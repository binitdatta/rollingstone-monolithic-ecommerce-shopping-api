package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Pricing;

public interface PricingDao {

   long save(Pricing pricing);

   Pricing get(long id);

   List<Pricing> list();

   void update(long id, Pricing pricing);

   void delete(long id);

}

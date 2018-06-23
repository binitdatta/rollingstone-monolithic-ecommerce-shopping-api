package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Shipping;

public interface ShippingDao {

   long save(Shipping shipping);

   Shipping get(long id);

   List<Shipping> list();

   void update(long id, Shipping shipping);

   void delete(long id);

}

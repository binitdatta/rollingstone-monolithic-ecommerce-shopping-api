package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Delivery;

public interface DeliveryDao {

   long save(Delivery delivery);

   Delivery get(long id);

   List<Delivery> list();

   void update(long id, Delivery delivery);

   void delete(long id);

}

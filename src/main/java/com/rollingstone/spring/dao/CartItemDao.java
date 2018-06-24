package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.CartItem;

public interface CartItemDao {

   long save(CartItem category);

   CartItem get(long id);

   List<CartItem> list();

   void update(long id, CartItem category);

   void delete(long id);

}

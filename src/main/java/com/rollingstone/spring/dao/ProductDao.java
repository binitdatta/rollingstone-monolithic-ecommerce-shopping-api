package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Product;

public interface ProductDao {

   long save(Product product);

   Product get(long id);

   List<Product> list();

   void update(long id, Product book);

   void delete(long id);

}

package com.rollingstone.spring.service;

import java.util.List;

import com.rollingstone.spring.model.Product;

public interface ProductService {

   long save(Product product);
   Product get(long id);
   List<Product> list();
   void update(long id, Product category);
   void delete(long id);
}

package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Category;

public interface CategoryDao {

   long save(Category category);

   Category get(long id);

   List<Category> list();

   void update(long id, Category category);

   void delete(long id);

}

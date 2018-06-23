package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.Promo;

public interface PromoDao {

   long save(Promo promo);

   Promo get(long id);

   List<Promo> list();

   void update(long id, Promo promo);

   void delete(long id);

}

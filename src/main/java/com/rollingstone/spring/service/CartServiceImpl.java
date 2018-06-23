package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.CartDao;
import com.rollingstone.spring.model.Cart;

@Service
@Transactional(readOnly = true)
public class CartServiceImpl implements CartService {

   @Autowired
   private CartDao cartDao;

   @Transactional
   @Override
   public long save(Cart cart) {
      return cartDao.save(cart);
   }

   @Override
   public Cart get(long id) {
      return cartDao.get(id);
   }

   @Override
   public List<Cart> list() {
      return cartDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Cart cart) {
      cartDao.update(id, cart);
   }

   @Transactional
   @Override
   public void delete(long id) {
      cartDao.delete(id);
   }

}

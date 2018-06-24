package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.CartItemDao;
import com.rollingstone.spring.model.CartItem;

@Service
@Transactional(readOnly = true)
public class CartItemServiceImpl implements CartItemService {

   @Autowired
   private CartItemDao cartItemDao;

   @Transactional
   @Override
   public long save(CartItem cart) {
      return cartItemDao.save(cart);
   }

   @Override
   public CartItem get(long id) {
      return cartItemDao.get(id);
   }

   @Override
   public List<CartItem> list() {
      return cartItemDao.list();
   }

   @Transactional
   @Override
   public void update(long id, CartItem cart) {
      cartItemDao.update(id, cart);
   }

   @Transactional
   @Override
   public void delete(long id) {
      cartItemDao.delete(id);
   }

}

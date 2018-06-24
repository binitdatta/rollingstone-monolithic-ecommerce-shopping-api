package com.rollingstone.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rollingstone.spring.model.CartItem;


@Repository
public class CartItemDaoImpl implements CartItemDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(CartItem cartItem) {
      sessionFactory.getCurrentSession().save(cartItem);
      return cartItem.getId();
   }

   @Override
   public CartItem get(long id) {
      return sessionFactory.getCurrentSession().get(CartItem.class, id);
   }

   @Override
   public List<CartItem> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<CartItem> cq = cb.createQuery(CartItem.class);
      Root<CartItem> root = cq.from(CartItem.class);
      cq.select(root);
      Query<CartItem> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, CartItem cartItem) {
      Session session = sessionFactory.getCurrentSession();
      CartItem existingCartItem = session.byId(CartItem.class).load(id);
      
      existingCartItem.setCartId(cartItem.getCartId());
      existingCartItem.setFulfillmentType(cartItem.getFulfillmentType());
      existingCartItem.setItemTotal(cartItem.getItemTotal());
      existingCartItem.setOfferId(cartItem.getOfferId());
      existingCartItem.setPrice(cartItem.getPrice());
      existingCartItem.setProductId(cartItem.getProductId());
      existingCartItem.setQuantity(cartItem.getQuantity());
      existingCartItem.setUnit(cartItem.getUnit());
     
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      CartItem cartItem = session.byId(CartItem.class).load(id);
      session.delete(cartItem);
   }

}

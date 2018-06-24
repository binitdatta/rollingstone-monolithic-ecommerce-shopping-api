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

import com.rollingstone.spring.model.Cart;

@Repository
public class CartDaoImpl implements CartDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Cart cart) {
      sessionFactory.getCurrentSession().save(cart);
      return cart.getId();
   }

   @Override
   public Cart get(long id) {
      return sessionFactory.getCurrentSession().get(Cart.class, id);
   }

   @Override
   public List<Cart> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Cart> cq = cb.createQuery(Cart.class);
      Root<Cart> root = cq.from(Cart.class);
      cq.select(root);
      Query<Cart> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Cart cart) {
      Session session = sessionFactory.getCurrentSession();
      Cart existingCart = session.byId(Cart.class).load(id);
      
      existingCart.setCartDate(cart.getCartDate());
      existingCart.setCartTotal(cart.getCartTotal());
      existingCart.setUser(cart.getUser());
     
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Cart cart = session.byId(Cart.class).load(id);
      session.delete(cart);
   }

}

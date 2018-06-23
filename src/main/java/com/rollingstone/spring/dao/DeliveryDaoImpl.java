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

import com.rollingstone.spring.model.Delivery;

@Repository
public class DeliveryDaoImpl implements DeliveryDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Delivery delivery) {
      sessionFactory.getCurrentSession().save(delivery);
      return delivery.getId();
   }

   @Override
   public Delivery get(long id) {
      return sessionFactory.getCurrentSession().get(Delivery.class, id);
   }

   @Override
   public List<Delivery> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Delivery> cq = cb.createQuery(Delivery.class);
      Root<Delivery> root = cq.from(Delivery.class);
      cq.select(root);
      Query<Delivery> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Delivery delivery) {
      Session session = sessionFactory.getCurrentSession();
      Delivery existingDelivery = session.byId(Delivery.class).load(id);
    
      existingDelivery.setAvailable(delivery.isAvailable());
      existingDelivery.setAvailableDate(delivery.getAvailableDate());
      existingDelivery.setDaysInTransit(delivery.getDaysInTransit());
      existingDelivery.setDeleveryCharge(delivery.getDeleveryCharge());
      existingDelivery.setFreeDeliveryAvailable(delivery.isFreeDeliveryAvailable());
      existingDelivery.setHasSpecialOffers(delivery.isHasSpecialOffers());
      existingDelivery.setHaulsAwayMessage(delivery.getHaulsAwayMessage());
      existingDelivery.setOfferId(delivery.getOfferId());
      existingDelivery.setProductId(delivery.getProductId());
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Delivery delivery = session.byId(Delivery.class).load(id);
      session.delete(delivery);
   }

}

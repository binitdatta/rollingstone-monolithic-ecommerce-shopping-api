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

import com.rollingstone.spring.model.Shipping;

@Repository
public class ShippingDaoImpl implements ShippingDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Shipping shipping) {
      sessionFactory.getCurrentSession().save(shipping);
      return shipping.getId();
   }

   @Override
   public Shipping get(long id) {
      return sessionFactory.getCurrentSession().get(Shipping.class, id);
   }

   @Override
   public List<Shipping> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Shipping> cq = cb.createQuery(Shipping.class);
      Root<Shipping> root = cq.from(Shipping.class);
      cq.select(root);
      Query<Shipping> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Shipping shipping) {
      Session session = sessionFactory.getCurrentSession();
      Shipping existingShipping = session.byId(Shipping.class).load(id);
      
      existingShipping.setAvailable(shipping.isAvailable());
      existingShipping.setAvailableDate(shipping.getAvailableDate());
      existingShipping.setDaysInTransit(shipping.getDaysInTransit());
      existingShipping.setFree(shipping.isFree());
      existingShipping.setOfferId(shipping.getOfferId());
      existingShipping.setProductId(shipping.getProductId());
      existingShipping.setShipCarrier(shipping.getShipCarrier());
      existingShipping.setShippingCharge(shipping.getShippingCharge());
      existingShipping.setShippingMode(shipping.getShippingMode());
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Shipping shipping = session.byId(Shipping.class).load(id);
      session.delete(shipping);
   }

}

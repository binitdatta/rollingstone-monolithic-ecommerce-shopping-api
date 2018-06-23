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

import com.rollingstone.spring.model.Pricing;

@Repository
public class PricingDaoImpl implements PricingDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Pricing pricing) {
      sessionFactory.getCurrentSession().save(pricing);
      return pricing.getId();
   }

   @Override
   public Pricing get(long id) {
      return sessionFactory.getCurrentSession().get(Pricing.class, id);
   }

   @Override
   public List<Pricing> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Pricing> cq = cb.createQuery(Pricing.class);
      Root<Pricing> root = cq.from(Pricing.class);
      cq.select(root);
      Query<Pricing> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Pricing pricing) {
      Session session = sessionFactory.getCurrentSession();
      Pricing existingPricing = session.byId(Pricing.class).load(id);
      
      existingPricing.setCurrencyCode(pricing.getCurrencyCode());
      existingPricing.setDiscountedPrice(pricing.getDiscountedPrice());
      existingPricing.setDiscuountAmount(pricing.getDiscuountAmount());
      existingPricing.setDisplay(pricing.getDisplay());
      existingPricing.setMemberType(pricing.getMemberType());
      existingPricing.setOriginalPrice(pricing.getOriginalPrice());
      existingPricing.setPricingId(pricing.getPricingId());
      existingPricing.setProductCode(pricing.getProductCode());
      existingPricing.setPriceType(pricing.getPriceType());
      existingPricing.setStatus(pricing.getStatus());
      
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Pricing pricing = session.byId(Pricing.class).load(id);
      session.delete(pricing);
   }

}

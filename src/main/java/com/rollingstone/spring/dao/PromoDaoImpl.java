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

import com.rollingstone.spring.model.Promo;

@Repository
public class PromoDaoImpl implements PromoDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Promo promo) {
      sessionFactory.getCurrentSession().save(promo);
      return promo.getId();
   }

   @Override
   public Promo get(long id) {
      return sessionFactory.getCurrentSession().get(Promo.class, id);
   }

   @Override
   public List<Promo> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Promo> cq = cb.createQuery(Promo.class);
      Root<Promo> root = cq.from(Promo.class);
      cq.select(root);
      Query<Promo> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Promo promo) {
      Session session = sessionFactory.getCurrentSession();
      Promo existingPromo = session.byId(Promo.class).load(id);
     
      existingPromo.setDiscountType(promo.getDiscountType());
      existingPromo.setDiscuountAmount(promo.getDiscuountAmount());
      existingPromo.setEndDate(promo.getEndDate());
      existingPromo.setMinimumPurchaseValue(promo.getMinimumPurchaseValue());
      existingPromo.setName(promo.getName());
      existingPromo.setProductCode(promo.getProductCode());
      existingPromo.setPromoCode(promo.getPromoCode());
      existingPromo.setStartDate(promo.getStartDate());
      existingPromo.setStatus(promo.getStatus());
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Promo promo = session.byId(Promo.class).load(id);
      session.delete(promo);
   }

}

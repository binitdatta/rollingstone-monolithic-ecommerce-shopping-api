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

import com.rollingstone.spring.model.StorePickup;

@Repository
public class StorepickupDaoImpl implements StorePickupDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(StorePickup spu) {
      sessionFactory.getCurrentSession().save(spu);
      return spu.getId();
   }

   @Override
   public StorePickup get(long id) {
      return sessionFactory.getCurrentSession().get(StorePickup.class, id);
   }

   @Override
   public List<StorePickup> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<StorePickup> cq = cb.createQuery(StorePickup.class);
      Root<StorePickup> root = cq.from(StorePickup.class);
      cq.select(root);
      Query<StorePickup> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, StorePickup spu) {
      Session session = sessionFactory.getCurrentSession();
      StorePickup existingStorePickup = session.byId(StorePickup.class).load(id);
      
      existingStorePickup.setAutostore(spu.isAutostore());
      existingStorePickup.setAvailableQuantity(spu.getAvailableQuantity());
      existingStorePickup.setCity(spu.getCity());
      existingStorePickup.setDays(spu.getDays());
      existingStorePickup.setFridayWorkingHours(spu.getFridayWorkingHours());
      existingStorePickup.setHighestStoreIndex(spu.getHighestStoreIndex());
      existingStorePickup.setInStockStatus(spu.getInStockStatus());
      existingStorePickup.setMondayWorkingHours(spu.getMondayWorkingHours());
      existingStorePickup.setNearest(spu.isNearest());
      existingStorePickup.setOfferId(spu.getOfferId());
      existingStorePickup.setPhone(spu.getPhone());
      existingStorePickup.setProductId(spu.getProductId());
      existingStorePickup.setPromoseDate(spu.getPromoseDate());
      existingStorePickup.setQuantity(spu.getQuantity());
      existingStorePickup.setRadius(spu.getRadius());
      existingStorePickup.setSaturdayWorkingHours(spu.getSaturdayWorkingHours());
      existingStorePickup.setState(spu.getState());
      existingStorePickup.setStoreName(spu.getStoreName());
      existingStorePickup.setStoreNumber(spu.getStoreNumber());
      existingStorePickup.setStreetAddress(spu.getStreetAddress());
      existingStorePickup.setSundayWorkingHours(spu.getSaturdayWorkingHours());
      existingStorePickup.setThursdayWorkingHours(spu.getThursdayWorkingHours());
      existingStorePickup.setTuesdayWorkingHours(spu.getTuesdayWorkingHours());
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      StorePickup spu = session.byId(StorePickup.class).load(id);
      session.delete(spu);
   }

}

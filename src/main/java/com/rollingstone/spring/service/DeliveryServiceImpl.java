package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.DeliveryDao;
import com.rollingstone.spring.model.Delivery;

@Service
@Transactional(readOnly = true)
public class DeliveryServiceImpl implements DeliveryService {

   @Autowired
   private DeliveryDao deliveryDao;

   @Transactional
   @Override
   public long save(Delivery delivery) {
      return deliveryDao.save(delivery);
   }

   @Override
   public Delivery get(long id) {
      return deliveryDao.get(id);
   }

   @Override
   public List<Delivery> list() {
      return deliveryDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Delivery delivery) {
      deliveryDao.update(id, delivery);
   }

   @Transactional
   @Override
   public void delete(long id) {
      deliveryDao.delete(id);
   }

}

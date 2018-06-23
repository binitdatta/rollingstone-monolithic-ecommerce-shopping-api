package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.ShippingDao;
import com.rollingstone.spring.model.Shipping;

@Service
@Transactional(readOnly = true)
public class ShippingServiceImpl implements ShippingService {

   @Autowired
   private ShippingDao shippingDao;

   @Transactional
   @Override
   public long save(Shipping shipping) {
      return shippingDao.save(shipping);
   }

   @Override
   public Shipping get(long id) {
      return shippingDao.get(id);
   }

   @Override
   public List<Shipping> list() {
      return shippingDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Shipping shipping) {
      shippingDao.update(id, shipping);
   }

   @Transactional
   @Override
   public void delete(long id) {
      shippingDao.delete(id);
   }

}

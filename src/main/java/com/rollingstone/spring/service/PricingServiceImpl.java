package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.PricingDao;
import com.rollingstone.spring.model.Pricing;

@Service
@Transactional(readOnly = true)
public class PricingServiceImpl implements PricingService {

   @Autowired
   private PricingDao pricingDao;

   @Transactional
   @Override
   public long save(Pricing pricing) {
      return pricingDao.save(pricing);
   }

   @Override
   public Pricing get(long id) {
      return pricingDao.get(id);
   }

   @Override
   public List<Pricing> list() {
      return pricingDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Pricing pricing) {
      pricingDao.update(id, pricing);
   }

   @Transactional
   @Override
   public void delete(long id) {
      pricingDao.delete(id);
   }

}

package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.StorePickupDao;
import com.rollingstone.spring.model.StorePickup;

@Service
@Transactional(readOnly = true)
public class StorePickupServiceImpl implements StorePickupService {

   @Autowired
   private StorePickupDao storePickupDao;

   @Transactional
   @Override
   public long save(StorePickup storePickup) {
      return storePickupDao.save(storePickup);
   }

   @Override
   public StorePickup get(long id) {
      return storePickupDao.get(id);
   }

   @Override
   public List<StorePickup> list() {
      return storePickupDao.list();
   }

   @Transactional
   @Override
   public void update(long id, StorePickup storePickup) {
      storePickupDao.update(id, storePickup);
   }

   @Transactional
   @Override
   public void delete(long id) {
      storePickupDao.delete(id);
   }

}

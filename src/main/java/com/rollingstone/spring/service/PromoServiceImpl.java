package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.PromoDao;
import com.rollingstone.spring.model.Promo;

@Service
@Transactional(readOnly = true)
public class PromoServiceImpl implements PromoService {

   @Autowired
   private PromoDao promoDao;

   @Transactional
   @Override
   public long save(Promo promo) {
      return promoDao.save(promo);
   }

   @Override
   public Promo get(long id) {
      return promoDao.get(id);
   }

   @Override
   public List<Promo> list() {
      return promoDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Promo promo) {
      promoDao.update(id, promo);
   }

   @Transactional
   @Override
   public void delete(long id) {
      promoDao.delete(id);
   }

}

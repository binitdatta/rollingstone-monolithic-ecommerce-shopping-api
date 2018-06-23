package com.rollingstone.spring.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rollingstone.spring.dao.CategoryDao;
import com.rollingstone.spring.dao.ProductDao;
import com.rollingstone.spring.model.Product;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

	  final static Logger logger = Logger.getLogger(ProductServiceImpl.class);

   @Autowired
   private ProductDao productDao;
   
  

   @Transactional
   @Override
   public long save(Product product) {
	   
	   if (product.getCategory() == null) {
		   logger.info("Product Category is null :");
	   }else {
		   logger.info("Product Category is not null :"+product.getCategory());
		   logger.info("Product Category is not null ID :"+product.getCategory().getId());

	   }
	   
	   if (product.getParentCategory() == null) {
		   logger.info("Product Parent Category is null :");
	   }else {
		   logger.info("Product Parent Category is not null :"+product.getParentCategory());
		   logger.info("Product Parent Category is not null Id :"+product.getParentCategory().getId());

	   }
	   
	
	  
      return productDao.save(product);
   }

   @Override
   public Product get(long id) {
      return productDao.get(id);
   }

   @Override
   public List<Product> list() {
      return productDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Product product) {
      productDao.update(id, product);
   }

   @Transactional
   @Override
   public void delete(long id) {
      productDao.delete(id);
   }

}

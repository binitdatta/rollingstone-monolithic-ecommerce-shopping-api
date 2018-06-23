package com.rollingstone.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rollingstone.spring.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

  final static Logger logger = Logger.getLogger(ProductDaoImpl.class);
	
   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Product product) {
	  
	   if (product.getCategory() == null) {
		   logger.info("Product Category is null :");
	   }else {
		   logger.info("Product Category is not null :"+product.getCategory());
	   }
	  
      sessionFactory.getCurrentSession().save(product);
      return product.getId();
   }

   @Override
   public Product get(long id) {
      return sessionFactory.getCurrentSession().get(Product.class, id);
   }

   @Override
   public List<Product> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Product> cq = cb.createQuery(Product.class);
      Root<Product> root = cq.from(Product.class);
      cq.select(root);
      Query<Product> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Product product) {
      Session session = sessionFactory.getCurrentSession();
      Product existingProduct = session.byId(Product.class).load(id);
      
      existingProduct.setAutomotive(product.isAutomotive());
      existingProduct.setCanDisplay(product.isCanDisplay());
      existingProduct.setCategory(product.getCategory());
      existingProduct.setParentCategory(product.getParentCategory());
      existingProduct.setDeleted(product.isDeleted());
      existingProduct.setInternational(product.isInternational());
      existingProduct.setLongDescription(product.getLongDescription());
      existingProduct.setProductCode(product.getProductCode());
      existingProduct.setProductName(product.getProductName());
      existingProduct.setShortDescription(product.getShortDescription());
    
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Product product = session.byId(Product.class).load(id);
      session.delete(product);
   }

}

package com.hibernatespringmavenpro;

import org.springframework.transaction.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	HibernateTemplate hibernateTemplate; // SF --> DS

	@Override
	@Transactional // session.gettransaction.commit; 
	public int createProduct(Product product) {
		hibernateTemplate.save(product);
		return 200;
	}

	@Override
	public Product getProduct(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}
	
	
}


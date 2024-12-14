package com.hibernatespringmavenpro;



public interface ProductDAO {
	int createProduct(Product product);
	Product getProduct(int id);

}

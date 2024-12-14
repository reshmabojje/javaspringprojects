package com.hibernatespringmavenpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ProductDAO productDAO = ctx.getBean("productDAO", ProductDAO.class);
		productDAO.createProduct(new Product(1, "Sunny", "Sunny", 21993));
		System.out.println("Done");
		Product product = productDAO.getProduct(11234);
		System.out.println(product);
	}

}

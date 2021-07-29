package com.lti.demo2;

public class UserApp {

	public static void main(String[] args) {
		Product p = new Product(101,"Mobile",3000);
		ProductService ps = new ProductService();
		String str = ps.addProduct(p);
		System.out.println(str);
		
		
		// TODO Auto-generated method stub

	}

}

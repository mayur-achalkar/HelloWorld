package com.lti.demo;

public class UserApp {

	public static void main(String[] args) {
		Calculator c =  new Calculator();
		int r  =  c.sum(100,200);
		System.out.println("Addition = "+r);
	}

}

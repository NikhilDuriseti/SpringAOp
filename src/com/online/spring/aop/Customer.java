package com.online.spring.aop;

// Primary functionality
public class Customer {
	
	public int addCustomer(int x){
		System.out.println("addCustomer() is running ");
		return 20;
	}
	
	public void addName(){		
		System.out.println("addName() is running ");   
		
		throw new IllegalArgumentException();
	}

}

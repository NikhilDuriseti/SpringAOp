package com.online.spring.aop;

// Primary functionality

public class CustomerImpl   {

	public String getName(){
		return "abc";
	}
	public int addCustomer(){
		System.out.println("addCustomer() is running ");   // 100
		return 0;
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "Venkat";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}

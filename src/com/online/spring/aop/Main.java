package com.online.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-customer.xml");

		Customer customer = (Customer) appContext.getBean("customer");
		customer.addCustomer(123);
		
		/*try{
			customer.addName();
		}	
		catch(Exception e){System.out.println("Caught...");}*/
		
	}

}

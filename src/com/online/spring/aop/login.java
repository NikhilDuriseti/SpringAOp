package com.online.spring.aop;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class login {
	
	
	// SF
		
		//@Before("execution(* addCustomer(..))")
		//@Before("execution(* addCustomer(*))")
		//@Before("execution(* addCustomer(*, *))")
		//@Before("execution(* addCustomer(*, int))")
		
		public void logBefore(JoinPoint joinPoint) {
			System.out.println("logBefore() is running!");
			System.out.println("Method name: " + joinPoint.getSignature().getName());
			System.out.println("-------");
		}
		
		@After("execution(* add*(..))")
		public void logAfter(JoinPoint joinPoint) {
			System.out.println("logAfter() is running!");
			System.out.println("Method name: " + joinPoint.getSignature().getName());
			System.out.println("-------");
		}
		
		/*@AfterReturning(
				pointcut = "execution(* com.online.spring.aop.Customer.addCustomer(..))", 
				returning= "result")*/
		public void logAfterReturning(JoinPoint joinPoint, Object result) {
			System.out.println("logAfterReturning() is running!");
			System.out.println("Method name:: " + joinPoint.getSignature().getName());
			System.out.println("Method returned value is : " + result);
			System.out.println("******");
		}
		
		/*@AfterThrowing(
				pointcut = "execution(* com.online.spring.aop.Customer.add*(..))", 
				throwing= "error")*/
		public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
			System.out.println("logAfterThrowing() is running!");
			System.out.println("Method name: : " + joinPoint.getSignature().getName());
			System.out.println("Exception : " + error);
			System.out.println("******");
		}
		
/*		@Around("execution(* com.online.spring.aop.Customer.addCustomer(..))")
		public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

			System.out.println("Around before is running!");
			System.out.println("******************************");

			logBefore(joinPoint);
			
			System.out.println("#############################################");
			
			joinPoint.proceed();
			
			System.out.println("******************************");
			System.out.println("Around after is running!");
			
			logAfter(joinPoint);
			System.out.println("#############################################");

			
		}*/
	}



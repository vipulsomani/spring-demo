package com.springdemo;

import java.io.Closeable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load configure fie
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
	// retreive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check for same bean
		boolean result = (theCoach == alphaCoach);
		
		
		//Print out result
		System.out.println("\n Pointing to the same object: " + result);
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for alphaCoach: " + alphaCoach);
		
		//close
		context.close();
		
	}

}

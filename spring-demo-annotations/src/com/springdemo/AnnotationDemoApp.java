package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach thecoach =context.getBean("tennisCoach",Coach.class);
		
		//call a method on bean
		System.out.println(thecoach.getDailyworkout());
		
		//call method daily fortune
		System.out.println(thecoach.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}

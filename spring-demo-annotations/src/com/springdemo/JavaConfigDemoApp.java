package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
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

package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		SwimCoach thecoach =context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on bean
		System.out.println(thecoach.getDailyworkout());
		
		//call method daily fortune
		System.out.println(thecoach.getDailyFortune());
		
		//call new methods
		System.out.println("email: "+ thecoach.getEmail());
		System.out.println("team: "+ thecoach.getTeam());
		
		
		//close the context
		context.close();
	}

}

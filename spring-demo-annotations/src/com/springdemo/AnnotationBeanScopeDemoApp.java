package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring confif file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retreive bean from spring container
				Coach theCoach = context.getBean("tennisCoach",Coach.class);
				Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are same 
				boolean result = (theCoach == alphaCoach);
				System.out.println("\n Pointing to same object "+ result);
				System.out.println("\n Memory loacation of theCoach "+ theCoach);
				System.out.println("\n Memory loacation of alpha "+ alphaCoach);
				
		context.close();
	}

}

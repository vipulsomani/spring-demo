package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//Default constructor
	public TennisCoach() {
		System.out.println(">> Tenis coach default constructor");
	}
	//define a setter method
	/*@Autowired
	public void doSomeCrazy(FortuneService theFortuneService) {
		System.out.println(">> Tennis coach setFortuneService method");
		fortuneService = theFortuneService;
	}
	*/
	
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	*/
	
	@Override
	public String getDailyworkout() {
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.springdemo;

public class BaseballCoach implements Coach{ 
	
	//Define private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for di
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in court";
		
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneservice to et a fortune
		return fortuneService.getFortune();
	}
}

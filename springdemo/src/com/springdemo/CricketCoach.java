package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	///Addd new fiels 
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println(" cricket Coach:Setter method setEmail");
		this.emailAddress = emailAddress;
		
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println(" cricket Coach:Setter method setTeam");
		this.team = team;
	}
	//create no-argument
	public CricketCoach() {
	System.out.println("CricketCoach:inside no arg constructor");
	}
	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter method");
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practicse fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

package com.rishabh.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//add new fields for email and team for literal injection
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setTeam");
		this.team = team;
	}

	//create a no arg constructor
	public CricketCoach(){
		System.out.println("Inside CricketCoach");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside SetterMethod SetFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play cricket today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.rishabh.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes baseballing";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}

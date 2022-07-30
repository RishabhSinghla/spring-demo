package com.rishabh.springdemo;

public class TrackCoach implements Coach {

	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return "Just do it" + fortuneService.getFortune();
	}
	
	//add an init method (bean lifecycle custom method)
	public void doMyStartupStuff()
	{
		System.out.println("inside startup");
	}
	
	//add a destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("inside cleanup");
	}

}

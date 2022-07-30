package com.rishabh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call our literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}

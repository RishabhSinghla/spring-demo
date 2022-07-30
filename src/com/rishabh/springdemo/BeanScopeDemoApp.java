package com.rishabh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//printout result
		System.out.println("\nPointing to same object " + result);
		
		System.out.println("\nMemory Location for theCoach: " + theCoach);
		
		System.out.println("\nMemory Location for theCoach: " + alphaCoach);
		
		context.close();
	}

}

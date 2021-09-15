package com.kush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopDemoApp {

	public static void main(String[] args) {
	
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = 
				context.getBean("thatSillyCoach", Coach.class);
		
		Coach alphaCoach = 
				context.getBean("thatSillyCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		System.out.println(result);
		
		// close the context
		context.close();

	}

}

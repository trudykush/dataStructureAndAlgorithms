package com.kush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(result);
		
		System.out.println("Memory: " + theCoach);
		
		System.out.println("Memory: " + alphaCoach);
		
		// close the context
		context.close();
	}
}

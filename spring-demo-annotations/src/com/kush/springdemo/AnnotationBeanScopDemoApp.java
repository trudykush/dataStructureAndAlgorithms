package com.kush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopDemoApp {

	public static void main(String[] args) {
	
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicatinoContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = 
				context.getBean("tennisCoach", Coach.class);
		

	}

}

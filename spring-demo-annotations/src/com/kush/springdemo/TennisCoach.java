package com.kush.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	// this is called Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("DEfault constructor");
	}
	
	// define init
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println("Post Construct");
	}
	
	// define destroy
	@PreDestroy
	public void preDestory() {
		System.out.println("Pre Destroy");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

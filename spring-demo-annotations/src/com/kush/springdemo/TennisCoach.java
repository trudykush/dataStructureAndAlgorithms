package com.kush.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
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

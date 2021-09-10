package com.kush.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice squash";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}

package com.kush.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define the constructor
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override 
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("StartUp");
	}
	
	// add a destroy method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("Destroy");
	}
}

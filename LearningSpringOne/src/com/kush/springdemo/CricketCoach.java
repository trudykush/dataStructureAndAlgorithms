package com.kush.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneSerive;
	
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket: Inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneSerive) {
		System.out.println("Cricket: Inside setter method");
		this.fortuneSerive = fortuneSerive;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSerive.getFortune();
	}

}

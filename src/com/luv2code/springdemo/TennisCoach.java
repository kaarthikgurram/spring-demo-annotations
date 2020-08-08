package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise your backhand volley";
	}

}

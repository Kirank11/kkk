package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teamInfo")
	public String getTeamInfo()
	{
		return "Coach Name = "+coachName+" Team Name = "+teamName;
	}
	
	//expose "/" endpoint
	@GetMapping("/")
	public String sayHello()
	{
		return "HelloWorld!! Time on the server is:"+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "Run hard Daily";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune()
	{
		return "Today is your lucky day";
	}
}

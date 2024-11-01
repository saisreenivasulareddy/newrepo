package com.example.Test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstConfig {
	
	@GetMapping("/")
	public String readFirstMessage()
	{
		return "this is sai";
	}

}

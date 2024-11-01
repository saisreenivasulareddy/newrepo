package com.example.Test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstConfig {
	
	@GetMapping("/")
	public String readFirstMessage()
	{
		return "this is sai";
	}

}

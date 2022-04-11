package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Excercise1Endoint {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello world!";
	}
	
	@RequestMapping(value="/echo", method=RequestMethod.POST)
	public String echo(@RequestBody String body) {
		return "echo: " + body;
	}
}

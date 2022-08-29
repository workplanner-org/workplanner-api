package com.workplanner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workplanner.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(1, String.format(template, name));
	}

}
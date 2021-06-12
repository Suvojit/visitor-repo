package com.diversified.visitorbackend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/abc")
	public String greetings() {
		return "Greetings from Spring Boot!";
	}

}

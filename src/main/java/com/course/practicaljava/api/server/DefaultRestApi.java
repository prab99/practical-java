package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

	@GetMapping(value = "/welcome")
	public String welcome() {
		System.out.println(StringUtils.join("Hello! ", "This is ", "Spring Boot ", "API "));
		return "Welcome to Prabhat test Spring Boot API";
	}
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
}

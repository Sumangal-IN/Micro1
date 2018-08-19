package com.example.micro1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class Micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro1Application.class, args);
	}
	
	@RequestMapping(value = "/getMili", method = RequestMethod.GET)
	@ResponseBody
	public long getMili() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Long> response = restTemplate.getForEntity("http://localhost:8003/getMili", Long.class);
		return response.getBody();
	}
		
}

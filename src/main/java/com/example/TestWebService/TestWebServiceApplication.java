package com.example.TestWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebServiceApplication.class, args);
	}



	@GetMapping("/Test")
	public String Test()
	{
		return "Test Method";
	}


}

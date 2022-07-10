package com.docker.DockerDemo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	@RequestMapping("/getName")
	public String getName() {
		return "Hello This is just for testing";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}

package com.example.roomapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class RoomApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomApiApplication.class, args);
	}
	@RequestMapping(value = "/room")
	public String home() {
		return "Eureka Client: Room application";
	}

}

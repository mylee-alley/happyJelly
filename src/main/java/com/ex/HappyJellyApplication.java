package com.ex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HappyJellyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyJellyApplication.class, args);
	}

}

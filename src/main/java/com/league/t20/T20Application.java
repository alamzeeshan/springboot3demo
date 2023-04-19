package com.league.t20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class T20Application {

	public static void main(String[] args) {
		SpringApplication.run(T20Application.class, args);
	}

}

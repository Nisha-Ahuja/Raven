package com.xclaymation.Raven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RavenApplication.class, args);
	}

}

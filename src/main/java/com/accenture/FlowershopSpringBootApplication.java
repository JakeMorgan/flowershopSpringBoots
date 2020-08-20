package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.accenture")
@EntityScan("com.accenture")
@EnableJpaRepositories("com.accenture")
@EnableAutoConfiguration
public class FlowershopSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowershopSpringBootApplication.class, args);
	}

}

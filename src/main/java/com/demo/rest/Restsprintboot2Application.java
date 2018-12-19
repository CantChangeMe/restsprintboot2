package com.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import(SwaggerConfig.class)
@EntityScan("model")
@EnableJpaRepositories(basePackages= {"repository"})
@EnableAutoConfiguration
@ComponentScan({"service","controller"})
public class Restsprintboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Restsprintboot2Application.class, args);
	}

}


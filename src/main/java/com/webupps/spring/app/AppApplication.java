package com.webupps.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.webupps.spring.app.*"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
/*
@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository"})
@EnableJpaRepositories(basePackages = {"com.mypackage.package.*"})
@SpringBootApplication(scanBasePackages = {"com.webupps.spring.app.controller"})
@SpringBootApplication(scanBasePackages = {"com.webupps.spring.app", "com.webupps.spring.app.controller"})
@EntityScan(basePackages = {"com.webupps.spring.app.model"})
@ComponentScan(basePackages = { "com.webupps.spring.app.repository" })
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com.webupps.spring.app.repositor@ComponentScan({"com.webupps.spring.app.repository", "com.webupps.spring.app.controlle‌​r"})*/


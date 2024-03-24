package com.webupps.spring.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.webupps.spring.app.repository.UsersRepository;
//@ComponentScan("com.webupps.spring.app.repository")

@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = {"com.webupps.spring.app.repository"})
public class AppConfig {
	


}

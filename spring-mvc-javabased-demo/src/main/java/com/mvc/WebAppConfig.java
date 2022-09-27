package com.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.mvc")
@EnableWebMvc
public class WebAppConfig {

	
	
	@Bean
	public ViewResolver viewresolevr()
	{
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		viewresolver.setPrefix("/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}

}

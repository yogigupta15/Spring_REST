package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.QuoteService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
	}
	@Bean
    public QuoteService getQuoteService() {
    	return new QuoteService();
    }
}

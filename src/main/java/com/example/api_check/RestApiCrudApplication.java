package com.example.api_check;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCrudApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return  new ModelMapper();
	}
}

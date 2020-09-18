package com.example.bdaceitunas;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
public class BdAceitunasApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BdAceitunasApplication.class, args);
		
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

//	@Bean
//	HealthIndicator miMetodo() {
//		HealthIndicator e = new HealthIndicator() {
//			@Override
//			public Health health() {
//				return Health.status("Hola este es mi estado").withDetail("timeStamp", System.currentTimeMillis()).build();
//			}
//		};
//		return e;
//	}
		
		
	
}

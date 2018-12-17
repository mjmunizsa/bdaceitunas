package com.example.bdaceitunas;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdAceitunasApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BdAceitunasApplication.class, args);
		
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
//	@EnableSwagger2
//	public class SwaggerConfig {                                    
//	    @Bean
//	    public Docket api() { 
//	        return new Docket(DocumentationType.SWAGGER_2)  
//	          .select()                                  
//	          .apis(RequestHandlerSelectors.any())              
//	          .paths(PathSelectors.any())                          
//	          .build();                                           
//	    }
//	}
	
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

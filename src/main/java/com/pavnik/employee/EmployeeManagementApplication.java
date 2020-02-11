package com.pavnik.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	 @Bean
	    public Docket api() { 
		    
		 return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())     
	          .paths(PathSelectors.any())
	          .build()
	          .apiInfo(apiInfo() );                                           
	    }
	 private ApiInfo apiInfo() {
		 Contact contact = new Contact("Thiru", "https://github.com/pavnikconsulting", "pavnikconsulting@outlook.com");
		    return new ApiInfoBuilder()
		            .title("SpringBoot API/JWT example")
		            .description("Employee spring-boot")
		            .termsOfServiceUrl("https://github.com/pavnikconsulting")
		            .contact(contact)
		            .license("Apache License Version 2.0")
		            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
		            .version("1.0.0")
		            .build();
		}
}

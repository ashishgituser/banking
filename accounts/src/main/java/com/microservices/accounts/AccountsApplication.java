package com.microservices.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info = @Info(
		title = "Accounts microservices REST API Documentation",
		description = "Easy bank account microservices REST API documentation",
		version = "v1",
		contact = @Contact(
			name = "Ashish Chaudhary",
			email = "ashish@gmail.com",
			url = "https://my-website.com"
		),
		license = @License(
			name = "Apache 2.0",
			url = "http://lincense.com/"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "Easybank Accounts microservices REST API documentation",
		url = "http://www.my.com/swagger.html"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

package com.cadastro.remedio.remedio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Description;

@SpringBootApplication
@OpenAPIDefinition(servers = @Server( url = "/", description = "server raiz do sistema"))
public class RemedioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemedioApplication.class, args);
	}

}

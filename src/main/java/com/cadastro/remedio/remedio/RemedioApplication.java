package com.cadastro.remedio.remedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(servers = @Server( url = "/", description = "server raiz do sistema"))
public class RemedioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemedioApplication.class, args);
	}

}

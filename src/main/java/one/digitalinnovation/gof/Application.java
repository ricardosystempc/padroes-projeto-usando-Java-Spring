package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Dependências:
 * Spring Web
 * Spring Data JPA SQL - Persistência de banco de dados relacionais
 * H2 DataBase SQL - É um banco de dados em memória para trabalhar de forma simplificada
 * OpenFeign - Declarative REST Client - para conseguir criar um cliente HTTP para consegui API Externa de uma maneira muito simples.
 * Spring Data JPA
 * 
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

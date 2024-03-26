package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - Open Feign
 * - Para acessar a aplicação digite o endereço abaixo:
 * http://127.0.0.1:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
 *
 * @author f
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}

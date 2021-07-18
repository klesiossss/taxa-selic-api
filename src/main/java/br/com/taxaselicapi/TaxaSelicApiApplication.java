package br.com.taxaselicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Para acessar a documentacao suba a aplicacao e acesse:
 * 
 * http://localhost:8080/swagger-ui.html 
 * 
 * ou se preferir basta rodar o front-end "advinhacao-web" no github 
 * 
 * 
 * */


@SpringBootApplication
public class TaxaSelicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxaSelicApiApplication.class, args);
	}

}

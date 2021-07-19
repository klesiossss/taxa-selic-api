package br.com.taxaselicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import br.com.taxaselicapi.config.MyFilter;

/**
 * Para acessar a documentacao suba a aplicacao e acesse:
 * 
 * http://localhost:8080
 * 
 *
 * 
 * 
 * */


@SpringBootApplication
public class TaxaSelicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxaSelicApiApplication.class, args);
	}
	
	    @Bean
	    public FilterRegistrationBean<MyFilter> filterRegistrationBean(){
	        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<MyFilter>();
	        MyFilter myFilter = new MyFilter();
	        filterRegistrationBean.setFilter(myFilter);
	        return filterRegistrationBean;
	    }

}

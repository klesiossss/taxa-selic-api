package br.com.taxaselicapi.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	       .apis(RequestHandlerSelectors.basePackage("br.com.taxaselicapi.controller"))
	        .paths(PathSelectors.any())
	        .build()
	        .useDefaultResponseMessages(false)
	        .apiInfo(apiInfo());
	}
    
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "API COMPRA DE PRODUTO COM BASE NA TAXA SELIC", 
	      "Esta API tem como objetivo retornar uma lista de parcelas dado um produto e uma condicao de pagamento. ", 
	      "API", 
	      "Terms of service", 
	      new Contact("Klesio Silva", "https://github.com/klesiossss", "klesiossss@gmail.com"), 
	      "Linkedin", "https://www.linkedin.com/in/klesio-silva-e-silva-87987717b/", Collections.emptyList());
	}
    
    private List<ResponseMessage> responseMessageForGET()
    {
        return new ArrayList<ResponseMessage>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
            add(new ResponseMessageBuilder()
                .code(500)
                .message("500 message")
                .responseModel(new ModelRef("Error"))
                .build());
            add(new ResponseMessageBuilder()
                    .code(200)
                    .message("Ok!")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(400)
                    .message("Bad Request!")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(404)
                    .message("Not Found!")
                    .build());
        }};
    }
}
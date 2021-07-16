package br.com.taxaselicapi.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.taxaselicapi.model.dto.SelicResponse;


public class SelicApi {
	
	@Autowired
	private RestTemplate restTemplate = new RestTemplate();
	
	public List<SelicResponse> obterTodos(){
	
	 String urlBase = "https://api.bcb.gov.br/dados/serie/bcdata.sgs.11/dados?formato=json";
	 System.out.println("passei!");
		HttpHeaders header =  new HttpHeaders();
		header.set("ContentType","application/json");
		HttpEntity<String> entity = new HttpEntity<>(header);
		
		ResponseEntity<SelicResponse[]> pessoas = restTemplate.exchange(urlBase, HttpMethod.GET, entity,SelicResponse[].class);
		
		return Arrays.asList(pessoas.getBody());
			
	}

}

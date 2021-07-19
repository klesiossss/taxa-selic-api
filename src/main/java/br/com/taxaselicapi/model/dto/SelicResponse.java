package br.com.taxaselicapi.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import io.swagger.annotations.ApiModelProperty;

public class SelicResponse {
	
	@ApiModelProperty(value = "data da cotacao da taxa selic")
	private String data;
	
	@ApiModelProperty(value = "taxa de juro selic")
	private Double valor;
	
	
	public SelicResponse(String data, Double valor) {
		this.data = data;
		this.valor = valor;
	}
	
	public SelicResponse() {
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	

}

package br.com.taxaselicapi.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SelicResponse {
	

	
	private String data;
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

package br.com.taxaselicapi.model;

import java.util.ArrayList;
import java.util.List;



public class Response {
	
	List<Parcela> parcelas;


	public Response(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}
	
	public Response() {	
		
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}
	
	
}

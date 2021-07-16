package br.com.taxaselicapi.model;



public class Parcela {
	
	private Integer numeroParcela;
	private Double valor;
	private Double taxaJurosAoMes;
	
	
	public Parcela(Integer i, Double valor, Double taxaJurosAoMes) {
		this.numeroParcela = i;
		this.valor = valor;
		this.taxaJurosAoMes = taxaJurosAoMes;
	}
	
	public Parcela() {

	}
	
	
	public Integer getNumeroParcela() {
		return numeroParcela;
	}
	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getTaxaJurosAoMes() {
		return taxaJurosAoMes;
	}
	public void setTaxaJurosAoMes(Double taxaJurosAoMes) {
		this.taxaJurosAoMes = taxaJurosAoMes;
	}	

}

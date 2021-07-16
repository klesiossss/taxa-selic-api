package br.com.taxaselicapi.model;



public class CondicaoPagamento {
	private Double valorEntrada;
	private Integer qtdeParcelas;
	
	
	
	public CondicaoPagamento(Double valorEntrada, Integer qtdeParcelas) {
		this.valorEntrada = valorEntrada;
		this.qtdeParcelas = qtdeParcelas;
	}
	
	public CondicaoPagamento() {
	
	}
	
	public Double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public Integer getQtdeParcelas() {
		return qtdeParcelas;
	}
	public void setQtdeParcelas(Integer qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}
	

	
}

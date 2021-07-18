package br.com.taxaselicapi.model;

import io.swagger.annotations.ApiModelProperty;

public class CondicaoPagamento {
	
	@ApiModelProperty(value = "Valor da entrada")
	private Double valorEntrada;
	
	@ApiModelProperty(value = "Quantidade de parcelas")
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

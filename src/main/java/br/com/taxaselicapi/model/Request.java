package br.com.taxaselicapi.model;

import io.swagger.annotations.ApiModelProperty;

public class Request {
	
	@ApiModelProperty(value = "Produto")
	private Produto produto;
	
	@ApiModelProperty(value = "Condicao de pagamento")
	private CondicaoPagamento condicaoPagamento;
	
	
	public Request( Produto produto, CondicaoPagamento condicaoPagamento) {
		
		this.produto = produto;
		this.condicaoPagamento = condicaoPagamento;
	}
	
	public Request() {
		
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public CondicaoPagamento getCondicaoPagamento() {
		return condicaoPagamento;
	}
	public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	

}

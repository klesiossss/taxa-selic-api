package br.com.taxaselicapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.taxaselicapi.api.SelicApi;
import br.com.taxaselicapi.model.CondicaoPagamento;
import br.com.taxaselicapi.model.Parcela;
import br.com.taxaselicapi.model.Produto;
import br.com.taxaselicapi.model.Request;
import br.com.taxaselicapi.model.Response;
import br.com.taxaselicapi.model.dto.SelicResponse;

@Service
public class ProdutoService {
	
	
	public Response obterParcelas(Request request) {
		Response response = new Response();
		List<Parcela> parcelas = new ArrayList<>();
		
		CondicaoPagamento condPague = request.getCondicaoPagamento();
		Produto produto = request.getProduto();
		Double taxaSelic = 0.0;
		Double parcela;
		Double aux;
		for(int i = 1; i<= condPague.getQtdeParcelas(); i++) {
			if(i == 7) taxaSelic = ConsultaTaxaSelic();
			aux = (produto.getValor()-condPague.getValorEntrada())/i;
			
			parcela = (1 + taxaSelic)*aux;
			parcelas.add(new Parcela(i, parcela, taxaSelic));
				
			}
		response.setParcelas(parcelas);
		return response;
		}	
	
	
	
	public List<SelicResponse> ConsultaUltimasTaxasSelic(){
		SelicApi selic = new SelicApi();
		List<SelicResponse> taxas = selic.obterTodos();
		List<SelicResponse> tx = new ArrayList<>();
		for(int i=taxas.size()-30; i<taxas.size() ; i++) {
			tx.add(taxas.get(i));
		}
		return tx;
		
	}
	
	
	public Double ConsultaTaxaSelic(){
		SelicApi selic = new SelicApi();
		List<SelicResponse> taxas = selic.obterTodos();
		
		SelicResponse selicResp =  taxas.get(taxas.size()-1);
		return selicResp.getValor();
	}

}

package br.com.taxaselicapi.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.taxaselicapi.model.CondicaoPagamento;
import br.com.taxaselicapi.model.Parcela;
import br.com.taxaselicapi.model.Produto;
import br.com.taxaselicapi.model.Request;
import br.com.taxaselicapi.model.Response;




@SpringBootTest
@DisplayName("Simula Compras - Selic")
public class ServiceTest {
	
	
	@InjectMocks
	private ProdutoService produtoService;
	
	private static Produto produto;
	private static CondicaoPagamento condicaoPagamento;
	private static List<Parcela> parcelas;
	private static Request request;
	private static Response response;
	
	
	@BeforeAll
	static void beforeAll() {
		produto = new Produto();	
		condicaoPagamento = new CondicaoPagamento();
		
		
		produto.setCodigo(1L);
		produto.setNome("Smartphone");
		produto.setValor(7000.0);
		
		condicaoPagamento.setQtdeParcelas(8);
		condicaoPagamento.setValorEntrada(1000.0);
	
		request = new Request();
		response = new Response();
	
	}
	
	
	@Test
	@DisplayName("Deve acionar um response de parcelas com base na taxa selic dado um request ")
	public  void TesteRetornandoParcelas() {
		//when(produtoService.obterParcelas(request)).thenReturn(response);
		
		request.setProduto(produto);
		request.setCondicaoPagamento(condicaoPagamento);
		
		Double taxa = 0.0;
		parcelas = new ArrayList<>();
		for(int i = 1; i<= condicaoPagamento.getQtdeParcelas(); i++) {
			
			if(i == 7) taxa = produtoService.ConsultaTaxaSelic();
			parcelas.add(new Parcela(i, (1 + taxa)*(produto.getValor()-condicaoPagamento.getValorEntrada())/i,taxa));
		}
		

		
		Response resp = produtoService.obterParcelas(request);
	
		assertAll(() -> {
			for(int i =0; i< parcelas.size(); i++) {
				
			assertEquals(resp.getParcelas().get(i).getValor(),parcelas.get(i).getValor());
			assertEquals(resp.getParcelas().get(i).getNumeroParcela(),parcelas.get(i).getNumeroParcela());
			assertEquals(resp.getParcelas().get(i).getTaxaJurosAoMes(),parcelas.get(i).getTaxaJurosAoMes());
			
			}
		});
		
	
}
	
	
//	@Test
//	@DisplayName("Deve lancar a excecao caso o stock nao reflita com a api")
//	void testLancaExcessao() {
//		when(quotedStockRepo.findById(1L)).thenReturn(Optional.empty());		
//		assertThrows(BusinessException.class, () -> quotedStockService.salvar(quotedStock));
//	}

	
}
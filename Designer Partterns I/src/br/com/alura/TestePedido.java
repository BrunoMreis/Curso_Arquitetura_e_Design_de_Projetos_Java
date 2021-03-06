package br.com.alura;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandl;
import br.com.alura.pedido.acao.EnviandoEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedido {

	public static void main(String[] args) {

		String cliente = "Bruno";
		BigDecimal valorOrcamento = new BigDecimal("2300");		
		int quantidadeItens = 6;
		
	
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandl handl = new GeraPedidoHandl(
				Arrays.asList(
						new SalvarPedidoNoBancoDeDados(),
						new EnviandoEmailPedido()
						)
				);
		
		handl.execute(gerador);
		
		
	}

}

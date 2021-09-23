package br.com.alura.pedido.acao;

import br.com.alura.pedido.AcoesAposGerarPedido;
import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcoesAposGerarPedido {
	
	public void execultarAcao(Pedido pedido) {
		System.out.println("Pedido Salvo");
	}

}

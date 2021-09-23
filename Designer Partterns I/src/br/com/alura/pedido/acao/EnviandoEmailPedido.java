package br.com.alura.pedido.acao;

import br.com.alura.pedido.AcoesAposGerarPedido;
import br.com.alura.pedido.Pedido;

public class EnviandoEmailPedido implements AcoesAposGerarPedido {

	public void execultarAcao(Pedido pedido) {
		
		System.out.println("E-mail enviado");
	}
}

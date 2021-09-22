package br.com.alura;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.Pedido;

public class TestePedido {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("400"), 4);
		String cliente = "Mariana";
		
		Pedido pedido = new Pedido(cliente, LocalDate.now(), orcamento);
		
		
		
		
	}

}

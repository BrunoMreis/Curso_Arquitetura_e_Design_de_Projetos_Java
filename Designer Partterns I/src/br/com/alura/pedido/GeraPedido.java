package br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.orcamento.Orcamento;

public class GeraPedido {
	
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidade;


	
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidade = quantidade;
	}


	public void execulta() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento,this.quantidade);
		
		Pedido pedido = new Pedido(this.cliente, LocalDate.now(), orcamento);
		
		System.out.println("Salva no Banco de dados");
		System.out.println("Envia e-mail");
				
	}

}
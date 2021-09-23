package br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.acao.EnviandoEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidade;

	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidade = quantidade;
	}



	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(BigDecimal valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}

package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private List<ItemOrcamento> itens = new ArrayList<ItemOrcamento>();

	public GeraPedido(String cliente, BigDecimal valorOrcamento ) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return itens.size();
	}

}

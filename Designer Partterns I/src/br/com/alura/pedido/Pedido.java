package br.com.alura.pedido;

import java.time.LocalDate;

import br.com.alura.orcamento.Orcamento;

public class Pedido {
	
	
	private String cliente;
	private LocalDate data;
	private Orcamento orcamento;

	
	public Pedido(String cliente, LocalDate data, Orcamento orcamento) {
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public Orcamento getOrcamento() {
		return orcamento;
	}


	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	
	
	
	

}

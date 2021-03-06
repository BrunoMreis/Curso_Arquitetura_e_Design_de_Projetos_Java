package br.com.alura.orcamento;
import java.math.BigDecimal;

import br.com.alura.situacao.EmAnalize;
import br.com.alura.situacao.SituacaoOcamento;

public class Orcamento {
	
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOcamento situacao = new EmAnalize();

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	public void aplicarDescontoExtra() {
	BigDecimal valorDoDescontoExtra = situacao.CalculaDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}



	public void setSituacao(SituacaoOcamento situacaoOcamento) {
		this.situacao = situacaoOcamento;
		
	}
	
	
	
	

}

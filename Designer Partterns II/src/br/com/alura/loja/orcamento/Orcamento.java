package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

	private BigDecimal valor;
	
	private SituacaoOrcamento situacao;
	private List<Orcavel>itens;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<Orcavel>();
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
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

	public BigDecimal getValor() {
		
		try {
			Thread.sleep(2000l);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return this.valor;
	}


	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado ;
	}

	
	public void addIten(Orcavel itemOrcavel) {
		this.valor = valor.add(itemOrcavel.getValor());
		this.itens.add(itemOrcavel);
	}

	public int getQuantidadeItens() {
		
		return this.itens.size();
	}
	
	
}

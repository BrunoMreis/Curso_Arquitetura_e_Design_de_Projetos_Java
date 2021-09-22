package br.com.alura.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public abstract class SituacaoOcamento {
	
	public BigDecimal CalculaDescontoExtra(Orcamento ocamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainExeptions("Orcamento não pode ser aprovado");
	}
	
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainExeptions("Orcamento não pode ser reprovado");
		
	}
	
	public void finalizar(Orcamento ocamento) {
		throw new DomainExeptions("Orcamento não pode ser finalizado");
	}

}

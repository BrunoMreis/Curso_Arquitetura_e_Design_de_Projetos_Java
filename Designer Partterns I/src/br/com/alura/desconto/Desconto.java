package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicarDesconto(orcamento)) {	
		
		return aplicaCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal aplicaCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicarDesconto(Orcamento orcamento);
	
}

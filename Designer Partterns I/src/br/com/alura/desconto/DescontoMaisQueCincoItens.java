package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoMaisQueCincoItens extends Desconto {

	public DescontoMaisQueCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal aplicaCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.1"));

	}

	@Override
	protected boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}

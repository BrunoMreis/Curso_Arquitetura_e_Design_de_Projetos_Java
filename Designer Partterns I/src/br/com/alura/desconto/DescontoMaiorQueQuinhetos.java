package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoMaiorQueQuinhetos extends Desconto {

	public DescontoMaiorQueQuinhetos(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal aplicaCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.05"));

	}

	protected boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}

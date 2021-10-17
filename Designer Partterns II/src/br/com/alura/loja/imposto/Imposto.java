package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;

	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorDoImpostoBigDecimal = realizarCalculo(orcamento);
		BigDecimal valoroutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) {
			valoroutroImposto = outroImposto.realizarCalculo(orcamento);
		}
		
		return valorDoImpostoBigDecimal.add(valoroutroImposto);
		
	}

}

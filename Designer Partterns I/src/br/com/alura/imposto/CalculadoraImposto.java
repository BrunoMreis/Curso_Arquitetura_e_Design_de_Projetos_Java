package br.com.alura.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraImposto {
	
	
	public BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento.getValor());

		
		
	}

}

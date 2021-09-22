package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.imposto.CalculadoraImposto;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

public class TesteCalculadoraImposto {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraImposto calculadora = new CalculadoraImposto();
		System.out.println(calculadora.calcula(orcamento, new ISS()));
		
	}

}

package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.desconto.CalculadoraDeDesconto;
import br.com.alura.orcamento.Orcamento;

public class TesteCalculadoraDesconto {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("300"), 7);
		Orcamento orcamento1 = new Orcamento(new BigDecimal("600"), 4);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("200"), 1);
		CalculadoraDeDesconto desconta = new CalculadoraDeDesconto();
		System.out.println(desconta.calcula(orcamento));
		System.out.println(desconta.calcula(orcamento1));
		System.out.println(desconta.calcula(orcamento2));
		
	}

}

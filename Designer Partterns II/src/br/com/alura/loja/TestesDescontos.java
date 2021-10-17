package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
	
		
		Orcamento primeiro = new Orcamento();
		primeiro.addIten(new ItemOrcamento(new BigDecimal("201")));
		primeiro.addIten(new ItemOrcamento(new BigDecimal("20")));
		primeiro.addIten(new ItemOrcamento(new BigDecimal("4")));
		primeiro.addIten(new ItemOrcamento(new BigDecimal("3")));
		primeiro.addIten(new ItemOrcamento(new BigDecimal("3")));
		primeiro.addIten(new ItemOrcamento(new BigDecimal("1")));
		
		
		Orcamento segundo = new Orcamento();
		segundo.addIten(new ItemOrcamento(new BigDecimal("1000")));
		segundo.addIten(new ItemOrcamento(new BigDecimal("1001")));
		
		Orcamento terceiro = new Orcamento();
		terceiro.addIten(new ItemOrcamento(new BigDecimal("1000")));

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}

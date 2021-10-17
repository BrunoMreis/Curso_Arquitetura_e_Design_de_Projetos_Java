package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteComposicao {
	
	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		
		antigo.addIten(new ItemOrcamento(BigDecimal.TEN));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		
		novo.addIten(new ItemOrcamento(new BigDecimal("20")));
		novo.addIten(antigo);
		
		
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
	}

}

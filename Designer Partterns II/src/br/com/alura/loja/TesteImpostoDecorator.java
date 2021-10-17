package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostoDecorator {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.addIten(new ItemOrcamento(BigDecimal.TEN));
		BigDecimal impostoTotal;
		
		
		ICMS imposto = new ICMS(new ISS(null));
		impostoTotal = imposto.calcular(orcamento);
		
		System.out.println(impostoTotal);
	}

}

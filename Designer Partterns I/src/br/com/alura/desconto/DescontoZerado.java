package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoZerado extends Desconto {

	public DescontoZerado() {
		super(null);
	}

	@Override
	protected BigDecimal aplicaCalculo(Orcamento orcamento) {
		
	 return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicarDesconto(Orcamento orcamento) {
		return true;
	}



}

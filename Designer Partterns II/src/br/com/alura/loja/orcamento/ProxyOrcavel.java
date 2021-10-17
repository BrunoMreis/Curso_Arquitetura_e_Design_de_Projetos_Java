package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ProxyOrcavel implements Orcavel {

	private BigDecimal valor;
	private Orcavel orcavel;
	
	
	
	
	
	public ProxyOrcavel(Orcavel orcavel) {
		this.valor = orcavel.getValor();
		this.orcavel = orcavel;
		
	}





	@Override
	public BigDecimal getValor() {
		if (valor==null) {
			this.valor = orcavel.getValor();
		}
		
		return this.valor;
	}

}

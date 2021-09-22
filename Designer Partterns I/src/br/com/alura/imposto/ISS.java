package br.com.alura.imposto;

import java.math.BigDecimal;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(BigDecimal valor) {
		
		return valor.multiply(new BigDecimal("0.1"));
	}

}

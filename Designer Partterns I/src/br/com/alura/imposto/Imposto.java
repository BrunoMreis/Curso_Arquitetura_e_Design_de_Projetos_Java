package br.com.alura.imposto;

import java.math.BigDecimal;

public interface Imposto {
	
	BigDecimal calcular(BigDecimal valor);

}

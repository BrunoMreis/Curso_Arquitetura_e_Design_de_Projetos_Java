package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcula(Orcamento orcamento) {
		Desconto cadeDeDesconto = new DescontoMaisQueCincoItens(
				new DescontoMaiorQueQuinhetos(
						new DescontoZerado()
						)
				);

		return cadeDeDesconto.calcular(orcamento);
	}

}

package br.com.alura.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class EmAnalize extends SituacaoOcamento {
	
	@Override
	public BigDecimal CalculaDescontoExtra(Orcamento ocamento) {
		return ocamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

}

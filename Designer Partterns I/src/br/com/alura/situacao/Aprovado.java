package br.com.alura.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class Aprovado extends SituacaoOcamento {
	
	@Override
	public BigDecimal CalculaDescontoExtra(Orcamento ocamento) {
		return ocamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}

package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteServide {

	

		private List<ValidaAumento> validacoes;

	
	public ReajusteServide(List<ValidaAumento> validacoes) {
		this.validacoes = validacoes;
	}
	
	
	public void reajusteSalarial(Funcionario funcionario, BigDecimal aumento) {
		
		for (ValidaAumento validaAumento : validacoes) {
			validaAumento.validar(funcionario, aumento);
		}
		
		BigDecimal salarioAjustado = funcionario.getSalario().add(aumento);
		funcionario.atualizaSalario(salarioAjustado);
		
	}

	
}

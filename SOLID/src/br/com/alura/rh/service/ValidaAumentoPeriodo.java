package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidaAumentoPeriodo implements ValidaAumento {
	
	
	
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate hoje = LocalDate.now();
		
		long periodoUltimoAumento = ChronoUnit.MONTHS.between(dataUltimoReajuste, hoje);
		
		if(periodoUltimoAumento > 6) {
			throw new ValidacaoException("Reajuste com periodo menor que 6 meses!");
		}
		
	}

}

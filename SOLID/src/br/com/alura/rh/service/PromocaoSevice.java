package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoSevice {
	
	
	public void promover(Funcionario funcionario , boolean metaBatida) {
		
		Cargo cargo = funcionario.getCargo();
		
		if(cargo == Cargo.GERENTE) {
			throw new ValidacaoException("Gerente Não pode ser promovido");
		}
		
		
		if(metaBatida) {
			funcionario.setCargo(cargo.promove());
		}else {
			throw new ValidacaoException("Meta não foi batida");
		}
		
	}

}

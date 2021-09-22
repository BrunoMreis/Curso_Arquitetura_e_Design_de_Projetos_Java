package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private DadosFuncionario dadoCadastraisFuncionario = new DadosFuncionario();
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadoCadastraisFuncionario.setNome(nome);
		this.dadoCadastraisFuncionario.setCpf(cpf);
		this.dadoCadastraisFuncionario.setCargo(cargo);
		this.dadoCadastraisFuncionario.setSalario(salario);
	}

	public void reajustarSalario(BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(dadoCadastraisFuncionario.getSalario(), RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		this.dadoCadastraisFuncionario.setSalario(this.dadoCadastraisFuncionario.getSalario().add(aumento));
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return dadoCadastraisFuncionario.getNome();
	}

	public void setNome(String nome) {
		this.dadoCadastraisFuncionario.setNome(nome);
	}

	public String getCpf() {
		return dadoCadastraisFuncionario.getCpf();
	}

	public void setCpf(String cpf) {
		this.dadoCadastraisFuncionario.setCpf(cpf);
	}

	public Cargo getCargo() {
		return dadoCadastraisFuncionario.getCargo();
	}

	public void setCargo(Cargo cargo) {
		this.dadoCadastraisFuncionario.setCargo(cargo);
	}

	public BigDecimal getSalario() {
		return dadoCadastraisFuncionario.getSalario();
	}

	public void setSalario(BigDecimal salario) {
		this.dadoCadastraisFuncionario.setSalario(salario);
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizaSalario(BigDecimal salarioAjustado) {
		this.dadoCadastraisFuncionario.setSalario(salarioAjustado);
		this.dataUltimoReajuste = LocalDate.now();
		
	}

}

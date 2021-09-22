package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private String empresa;
	private DadosFuncionario dadosCadastraisFuncionario;
	


	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
			this.dadosCadastraisFuncionario.setNome(nome);
			this.dadosCadastraisFuncionario.setCpf(cpf);
			this.dadosCadastraisFuncionario.setCargo(cargo);
			this.dadosCadastraisFuncionario.setSalario(salario);
		}
	
	public String getNome() {
		return dadosCadastraisFuncionario.getNome();
	}

	public void setNome(String nome) {
		this.dadosCadastraisFuncionario.setNome(nome);
	}

	public String getCpf() {
		return dadosCadastraisFuncionario.getCpf();
	}

	public void setCpf(String cpf) {
		this.dadosCadastraisFuncionario.setCpf(cpf);
	}

	public Cargo getCargo() {
		return dadosCadastraisFuncionario.getCargo();
	}

	public void setCargo(Cargo cargo) {
		this.dadosCadastraisFuncionario.setCargo(cargo);
	}

	public BigDecimal getSalario() {
		return dadosCadastraisFuncionario.getSalario();
	}

	public void setSalario(BigDecimal salario) {
		this.dadosCadastraisFuncionario.setSalario(salario);
	}
	
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}

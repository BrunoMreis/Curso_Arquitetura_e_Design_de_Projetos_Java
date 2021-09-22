package br.com.alura.situacao;

public class DomainExeptions extends RuntimeException {

	public DomainExeptions(String string) {
		super(string);
	}

	private static final long serialVersionUID = 1L;

}

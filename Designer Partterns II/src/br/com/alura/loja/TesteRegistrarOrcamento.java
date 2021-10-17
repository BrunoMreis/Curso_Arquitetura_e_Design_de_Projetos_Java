package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOcorrencia;
import br.com.alura.loja.orcamento.http.JavaHttpClient;

public class TesteRegistrarOrcamento {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.addIten(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOcorrencia registroDeOcorrencia = new RegistroDeOcorrencia(new JavaHttpClient());
		registroDeOcorrencia.registrar(orcamento);
		
	}

}

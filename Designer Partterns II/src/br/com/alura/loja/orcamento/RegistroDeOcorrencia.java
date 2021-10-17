package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.http.HTTPAdapter;

public class RegistroDeOcorrencia {
	
	private HTTPAdapter http;
	
	
	public RegistroDeOcorrencia(HTTPAdapter http) {
		this.http = http;
	}
	
	
	public void registrar(Orcamento orcamento) {
		
		isFinalizado(orcamento);
		
		String url="www.xbox.com/play";
		Map<String, Object> map = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeDeItens", orcamento.getQuantidadeItens());
		
		this.http.publicar(url, map);
	}


	private void isFinalizado(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado");
			
		}
	}

	
	
}

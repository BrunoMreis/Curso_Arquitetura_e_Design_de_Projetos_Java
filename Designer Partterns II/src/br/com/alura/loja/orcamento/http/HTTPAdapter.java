package br.com.alura.loja.orcamento.http;

import java.util.Map;

public interface HTTPAdapter {
	
	void publicar(String url, Map<String, Object> dados);

}

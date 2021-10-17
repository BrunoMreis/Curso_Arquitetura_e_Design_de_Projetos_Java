package br.com.alura.loja.orcamento.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HTTPAdapter {

	@Override
	public void publicar(String url, Map<String, Object> dados) {
		
		try {
			URL urlDaApi = new URL(url);
			URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisisão", e);
		}
		

	}

}

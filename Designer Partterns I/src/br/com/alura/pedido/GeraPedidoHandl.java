package br.com.alura.pedido;

import java.time.LocalDate;
import java.util.List;

import br.com.alura.orcamento.Orcamento;

public class GeraPedidoHandl {
	private List<AcoesAposGerarPedido> acoes;

	public GeraPedidoHandl(List<AcoesAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {

		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidade());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

	
		acoes.forEach(a -> a.execultarAcao(pedido));
	}
}
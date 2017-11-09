package br.com.seniorsolution.facade;

public class TestePedidoFacade {
	public static void main(String[] args) {
		
		//PATTERN FACADE: AGRUPA OBJETOS A SEREM EXECUTADOS EM SEQUENCIA.
		
		Pedido pedido = new Pedido("Celular", "Kelvin", "Rua Forte do Triunfo");
		
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		facade.registrarPedido(pedido);
	}
	


}

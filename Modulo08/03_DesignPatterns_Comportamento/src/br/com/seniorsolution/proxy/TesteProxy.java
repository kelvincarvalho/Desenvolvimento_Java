package br.com.seniorsolution.proxy;

public class TesteProxy {
	public static void main(String[] args) {
		
		Conta conta = new ContaPadrao();
		
		Conta proxy = new ContaProxy(conta);
		proxy.depositar(100);
		proxy.sacar(20);
		System.out.println(proxy.getSaldo());
	}
}

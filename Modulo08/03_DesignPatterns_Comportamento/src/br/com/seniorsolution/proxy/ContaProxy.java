package br.com.seniorsolution.proxy;

public class ContaProxy implements Conta {
	
	private Conta conta;
	
	
	public ContaProxy(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void depositar(double valor) {
		System.out.println("Deposito de "+valor);
		this.conta.depositar(valor);
	}

	@Override
	public void sacar(double valor) {
		System.out.println("Saque de "+valor);
		this.conta.sacar(valor);	
	}

	@Override
	public double getSaldo() {
		System.out.println("Consultando o saldo");
		return this.conta.getSaldo();
	}

}

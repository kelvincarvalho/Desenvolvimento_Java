package br.com.seniorsolution.facade;

public class Financeiro {
	
	public void faturar(String cliente, String produto) {
		System.out.println("Fatura ");
		System.out.println("Cliente-> "+cliente);
		System.out.println("Produto->"+produto);
	}
}

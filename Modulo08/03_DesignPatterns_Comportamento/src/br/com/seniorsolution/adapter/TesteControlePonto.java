package br.com.seniorsolution.adapter;

public class TesteControlePonto {

	public static void main(String[] args) throws InterruptedException {
		//PATERN ADAPTER: PERMITE CRIAR UMA SEGUNDA CLASSE CONTENDO AS MESMAS OPRE��ES DE UMA CLASSE
		//CONTENDO AS MESMAS OPERA��ES DE UMA CLASSE TOMADA COMO BASE, MAS UTILIZANDO ELEMENTOS DIFERENTES(ADAPTAVEIS)
		
		//USANDO A CLASSE ORIGINAL
		System.out.println("Classe ControlePonto");
		ControlePonto cp = new ControlePonto();
		Funcionario f= new Funcionario("Kelvin", "Estagi�rio");
		cp.registrarEntrada(f);
		
		Thread.sleep(5000);
		
		cp.registrarSaida(f);
		
		System.out.println("-------------------------");
		
		//USANDO AO ADAPTER
		System.out.println("Classe ControlePontoAdapter");
		ControlePonto cpa = new ControlePonto();
		Funcionario fa= new Funcionario("Kelvin Adapter", "Estagi�rio");
		cpa.registrarEntrada(fa);
				
		Thread.sleep(5000);
				
		cp.registrarSaida(fa);
	}

}

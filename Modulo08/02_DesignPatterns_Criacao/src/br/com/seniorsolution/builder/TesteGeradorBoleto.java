package br.com.seniorsolution.builder;

public class TesteGeradorBoleto {

	public static void main(String[] args) {
		//BoletoBuilder boletoBuilder = new BancoItauBoletoBuilder();
		GeradorBoleto geradorBoleto = new GeradorBoleto(new BancoItauBoletoBuilder());
		Boleto boleto = geradorBoleto.gerarBoleto();
		System.out.println(boleto);

	}

}

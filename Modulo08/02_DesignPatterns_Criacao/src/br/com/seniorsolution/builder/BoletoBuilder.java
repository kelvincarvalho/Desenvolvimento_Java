package br.com.seniorsolution.builder;

import java.util.Calendar;

public interface BoletoBuilder {

	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(double valor);
	void buildVencimento(Calendar vencimento);
	void vuildNossoNumero(int nossoNumero);
	
	Boleto getBoleto();
	
}

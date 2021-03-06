package br.com.seniorsolution.builder;

import java.util.Calendar;

public class BancoItauBoletoBuilder implements BoletoBuilder{
	
	private String sacado, cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	

	
	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
		
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
		
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
		
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
		
	}

	@Override
	public void vuildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
		
	}

	@Override
	public Boleto getBoleto() {
		return new BancoItauBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}

}

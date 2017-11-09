package br.com.seniorsolution.abstractfactory;

public class EmissorCreator {
	
	public Emissor create(TipoEmissor tipo) {
		switch(tipo) {
			case VISA: return new EmissorVisa();
			case MASTER: return new EmissorMaster();
			default: throw new IllegalArgumentException("Tipo Inv�lido");
		}
	}
	
}

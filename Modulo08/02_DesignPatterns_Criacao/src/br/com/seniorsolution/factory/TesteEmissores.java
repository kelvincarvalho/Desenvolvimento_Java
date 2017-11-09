package br.com.seniorsolution.factory;

import java.util.Date;

public class TesteEmissores {

	public static void main(String[] args) {
		//PADRAO FACTORY
		//Permite encapsular uma classe concreta a ser utilizada na cria��o de objetos de um determinado tipo 
		
		Emissor em1 = new EmissorSMS();
		Emissor em2 = new EmissorEmail();
		Emissor em3 = new EmissorMaquininha();
		imprimir(em1, "Valor-> R$5.000 - "+ new Date());
		imprimir(em2, "Valor-> R$5.000 - "+ new Date());
		imprimir(em3, "Valor-> R$5.000 - "+ new Date());
	}
	
	private static void imprimir(Emissor em, String mensagem) {
		em.enviar(mensagem);
	}

}
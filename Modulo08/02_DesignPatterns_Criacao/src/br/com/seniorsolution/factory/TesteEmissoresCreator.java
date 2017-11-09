package br.com.seniorsolution.factory;

import java.util.Date;

public class TesteEmissoresCreator {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		
		Emissor em1 = creator.create(TipoEmissor.SMS);
		Emissor em2 = creator.create(TipoEmissor.EMAIL);
		Emissor em3 = creator.create(TipoEmissor.MAQUINA);
		
		imprimir(em1, "Valor-> R$5.000 - "+ new Date() +"\n");
		imprimir(em2, "Valor-> R$5.000 - "+ new Date() +"\n");
		imprimir(em3, "Valor-> R$5.000 - "+ new Date() +"\n");
	}
	
	private static void imprimir(Emissor em, String mensagem) {
		em.enviar(mensagem);
	}
}

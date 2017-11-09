package br.com.seniorsolution.abstractfactory;

public class EmissorMaster implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem para MASTER: ");
		System.out.println(mensagem);
		
	}

}

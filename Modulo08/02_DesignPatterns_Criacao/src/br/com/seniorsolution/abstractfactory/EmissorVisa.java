package br.com.seniorsolution.abstractfactory;

public class EmissorVisa implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem para VISA: ");
		System.out.println(mensagem);
		
	}

}

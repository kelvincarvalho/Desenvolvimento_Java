package br.com.seniorsolution.factory;

public class EmissorEmail implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por Email");
		System.out.println(mensagem);
		
	}

}

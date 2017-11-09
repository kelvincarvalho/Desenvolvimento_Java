package br.com.seniorsolution.decorator;

public class EmissorBasico implements Emissor{

	
	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem Basica: ");
		System.out.println(mensagem);
	}

}
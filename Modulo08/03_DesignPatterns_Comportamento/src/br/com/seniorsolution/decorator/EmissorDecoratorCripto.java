package br.com.seniorsolution.decorator;

public class EmissorDecoratorCripto extends EmissorDecorator{

	public EmissorDecoratorCripto(Emissor emissor) {
		super(emissor);
	
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando Mensagem Criptografada...");
		this.getEmissor().enviar(criptografar(mensagem));
		
	}
	
	private String criptografar(String mensagem) {
		return new StringBuilder(mensagem).reverse().toString();
	}
}

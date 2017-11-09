package br.com.seniorsolution.decorator;

public class TesteEmissorDecorator {
	//PATERN DECORATOR: PERMITE AGREGAR/COMBINAR FUNCIONALIDADES A UM OBJETO, 
	//POR MEIO DE PASSAGEM DE OUTROS OBJETOS DO MESMO TIPO COMO PARAMETRO
	
	public static void main(String[] args) {
		String mensagem="KelvinZ!K@";
		
		Emissor basico = new EmissorBasico();
		basico.enviar(mensagem);
		System.out.println();
		
		Emissor cripto = new EmissorDecoratorCripto(new EmissorBasico());
		cripto.enviar(mensagem);
		System.out.println();
		
		Emissor completo = new EmissorDecoratorCompress(new EmissorBasico());
		completo.enviar(mensagem);
		System.out.println();
	}

}

package br.com.seniorsolution.abstractfactory;

public class ReceptorVisa implements Receptor{

	@Override
	public String receber() {
		System.out.println("Recebendo mensagem de VISA");
		String mensagem = "Valor pago para VISA";
		return mensagem;
	}

}

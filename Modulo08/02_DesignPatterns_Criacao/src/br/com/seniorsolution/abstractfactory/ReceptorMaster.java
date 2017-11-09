package br.com.seniorsolution.abstractfactory;

public class ReceptorMaster implements Receptor{

	@Override
	public String receber() {
		System.out.println("Recebendo mensagem de MASTERCARD");
		String mensagem = "Valor pago para MASTERCARD";
		return mensagem;
	}

	
	
}

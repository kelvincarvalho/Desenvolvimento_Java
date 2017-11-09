package br.com.seniorsolution.estagiario;

import br.com.seniorsolution.mediator.Mediator;

public class LKestagiarios extends Estagiario {

	public LKestagiarios(Mediator m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Leonardo e Kelvin receberam: " + mensagem);
		
	}

}

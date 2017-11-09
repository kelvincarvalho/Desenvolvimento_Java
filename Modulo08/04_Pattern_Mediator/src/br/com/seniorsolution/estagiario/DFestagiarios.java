package br.com.seniorsolution.estagiario;

import br.com.seniorsolution.mediator.Mediator;

public class DFestagiarios extends Estagiario{
	
	
	public DFestagiarios(Mediator m) {
		super(m);
	}

 
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Daniel e Felipe receberam: " + mensagem);
    }
}



package br.com.seniorsolution.estagiario;

import br.com.seniorsolution.mediator.Mediator;

public abstract class Estagiario {

	protected Mediator mediator;
	 
    public Estagiario(Mediator m) {
        mediator = m;
    }
 
    public void enviarMensagem(String mensagem) {
        mediator.enviar(mensagem, this);
    }
 
    public abstract void receberMensagem(String mensagem);
}
	


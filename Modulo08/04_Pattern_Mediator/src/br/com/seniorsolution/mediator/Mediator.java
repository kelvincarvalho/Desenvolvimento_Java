package br.com.seniorsolution.mediator;

import br.com.seniorsolution.estagiario.Estagiario;

public interface Mediator {
	
	   void enviar(String mensagem, Estagiario estagiario);
}

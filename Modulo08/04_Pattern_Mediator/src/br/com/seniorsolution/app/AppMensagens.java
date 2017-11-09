package br.com.seniorsolution.app;

import br.com.seniorsolution.estagiario.DFestagiarios;
import br.com.seniorsolution.estagiario.LKestagiarios;
import br.com.seniorsolution.mediator.MensagemMediator;

public class AppMensagens {

	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
		 
	    DFestagiarios df = new DFestagiarios(mediador);
	    LKestagiarios lk = new LKestagiarios(mediador);

	 
	    mediador.adicionarColleague(df);
	    mediador.adicionarColleague(lk);

	     
	    df.enviarMensagem("Oi Kelvin e Leonardo, n�s estamos programando Pattern Interator!");
	    System.out.println("=========");
	    lk.enviarMensagem("Oi Felipe e Daniel! Estamos programando Pattern Mediator!");
	    System.out.println("=========");
	  
	}

	}


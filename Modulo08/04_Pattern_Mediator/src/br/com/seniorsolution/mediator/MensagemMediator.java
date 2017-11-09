package br.com.seniorsolution.mediator;

import java.util.ArrayList;

import br.com.seniorsolution.estagiario.DFestagiarios;
import br.com.seniorsolution.estagiario.Estagiario;
import br.com.seniorsolution.estagiario.LKestagiarios;

public class MensagemMediator implements Mediator {
	
	
	 protected ArrayList<Estagiario> estagiarios;
	 
	 public MensagemMediator() {
	        estagiarios = new ArrayList<Estagiario>();
	    }
	 
	  public void adicionarColleague(Estagiario estagiario) {
	        estagiarios.add(estagiario);
	    }
	
	@Override
	public void enviar(String mensagem, Estagiario estagiario) {
		for (Estagiario dupla : estagiarios) {
            if (dupla != estagiario) {
                definirProtocolo(dupla);
                dupla.receberMensagem(mensagem);
            }
        }
		
	}
	
	private void definirProtocolo(Estagiario estagiario) {
        if (estagiario instanceof  DFestagiarios) {
            System.out.println("Protocolo DF");
        } else if (estagiario instanceof LKestagiarios) {
            System.out.println("Protocolo LK");
        }
    }

}

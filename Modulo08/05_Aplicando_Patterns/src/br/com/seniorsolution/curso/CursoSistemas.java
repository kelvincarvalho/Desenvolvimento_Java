package br.com.seniorsolution.curso;

import java.util.ArrayList;
import java.util.List;


public class CursoSistemas  implements Pool<Disciplina>{
	
	List<Disciplina> disciplinas;
	
	public CursoSistemas() {
		
		
		disciplinas = new ArrayList<>();
		disciplinas.add(new Disciplina("Java", "Sistemas"));
		disciplinas.add(new Disciplina("Estrutura de Dados","Sistemas"));
		disciplinas.add(new Disciplina("C","Sistemas"));
			
	}
	


	@Override
	public Disciplina ocupar() {
		if(disciplinas.size() >0) {
			return this.disciplinas.remove(0);
		}
		return null;
	}

	@Override
	public void liberar(Disciplina t) {
		disciplinas.add(t);
		
	}
	
}
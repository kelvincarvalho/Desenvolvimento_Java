package br.com.seniorsolution.curso;

import java.util.ArrayList;
import java.util.List;

public class CursoCiencia implements Pool<Disciplina>{
	
List<Disciplina> disciplinas;
	
	public CursoCiencia() {
		
		disciplinas = new ArrayList<>();
		disciplinas.add(new Disciplina("C#", "Ciencia da Computacao"));
		disciplinas.add(new Disciplina("x","Ciencia da Computacao"));
		disciplinas.add(new Disciplina("Z","Ciencia da Computacao"));
			
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

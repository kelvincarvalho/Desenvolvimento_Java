package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	
	
	
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, String curso) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir(){
		String resultado= super.exibir()+ 
						"\n MATRICULA : "+this.getMatricula()+
						"\n CURSO \n"+this.getCurso();
		
		return resultado;
	}

	
}

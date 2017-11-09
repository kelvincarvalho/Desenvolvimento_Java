package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso){
		super(nome,idade,sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso, Endereco endereco){
		this(nome,idade,sexo,matricula,curso);
		this.setEndereco(endereco);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir(){
		String resultado = super.exibir() +
							"\nMatr�cula: " + this.getMatricula() +
							"\nCurso: \n" + this.getCurso().exibir();
		return resultado;
	}
}

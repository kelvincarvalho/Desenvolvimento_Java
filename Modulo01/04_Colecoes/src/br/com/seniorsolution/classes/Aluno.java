package br.com.seniorsolution.classes;

import java.util.Set;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	
	
	private int matricula;
	private Curso curso;
	private Set<Curso> outrosCursos;
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso) 
	{
		super(nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
		
	public int getMatricula() 
	{
		return matricula;
	}
	
	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}
		
	public Curso getCurso() 
	{
		return curso;
	}

	public void setCurso(Curso curso) 
	{
		this.curso = curso;
	}
	
	public Set<Curso> getOutrosCursos() {
		return outrosCursos;
	}

	public void setOutrosCursos(Set<Curso> outrosCursos) {
		this.outrosCursos = outrosCursos;
	}
	
	@Override
	public String exibir() 
	{
		String resultado = super.exibir() + 
						   "\nMatricula: " + this.getMatricula() + 
						   "\n\nCurso: \n" + this.getCurso().exibir();
		if(this.getOutrosCursos() != null)
		{
			resultado += "\nCursos anteriores: " + this.getOutrosCursos();
			for (Curso item : this.getOutrosCursos()) {
				
				resultado += "\n   " + item;
				
			}
		}
		
		return resultado;
		
	}
	
	@Override
	public String toString() {
		String resposta = super.toString();
		if(this.getCurso() != null){
			resposta += "- Curso: " +this.getCurso().getDescricao();
		}
		return resposta;
	}

}

package br.com.seniorsolution.classes;

public class CursoGraduacao extends Curso {
	private int numeroSemestres;
	
	
	public CursoGraduacao(int codigo, String descricao, int cargaHoraria, int numeroSemestres) throws IllegalAccessException{
		
		super(codigo, descricao, cargaHoraria);
		this.setNumeroSemestres(numeroSemestres);
	
	}
	


	public int getNumeroSemestres() {
		return numeroSemestres;
	}

	public void setNumeroSemestres(int numeroSemestres) {
		this.numeroSemestres = numeroSemestres;
	}
	
	
	public String exibir(){
		String resultado = super.exibir() + "\n Numero de Semestres"+this.numeroSemestres;
		
		return resultado;
	}
	
	
}

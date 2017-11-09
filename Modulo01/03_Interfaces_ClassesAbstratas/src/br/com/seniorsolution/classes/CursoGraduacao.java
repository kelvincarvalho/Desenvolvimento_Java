package br.com.seniorsolution.classes;

public class CursoGraduacao extends Curso{
	private int numSemestres;

	public CursoGraduacao(int codigo, String titulo, int cargaHoraria, int numSemestres) throws IllegalAccessException {
		super(codigo,titulo,cargaHoraria);//super() tem que ser o primeiro comando (implicitamente, ele já é)
											//objeto da subclasse só passa a existir quando o da superclasse já existe
		this.setNumSemestres(numSemestres);
	}
	
	public int getNumSemestres() {
		return numSemestres;
	}

	public void setNumSemestres(int numSemestres) {
		this.numSemestres = numSemestres;
	}
	
	@Override
	public String exibir() {
		String resultado = super.exibir() +
							"\nNúmero de Semestres: " + this.getNumSemestres();
		return resultado;
	}
}

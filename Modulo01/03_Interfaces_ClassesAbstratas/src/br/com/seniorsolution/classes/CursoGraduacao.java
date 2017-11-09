package br.com.seniorsolution.classes;

public class CursoGraduacao extends Curso{
	private int numSemestres;

	public CursoGraduacao(int codigo, String titulo, int cargaHoraria, int numSemestres) throws IllegalAccessException {
		super(codigo,titulo,cargaHoraria);//super() tem que ser o primeiro comando (implicitamente, ele j� �)
											//objeto da subclasse s� passa a existir quando o da superclasse j� existe
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
							"\nN�mero de Semestres: " + this.getNumSemestres();
		return resultado;
	}
}

package br.com.seniorsolution.classes;

public class CursoPos extends Curso{
	private int numModulos;

	public CursoPos(int codigo, String titulo, int cargaHoraria, int numModulos) throws IllegalAccessException{
		super(codigo,titulo,cargaHoraria);
		this.setNumModulos(numModulos);
	}
	
	public int getNumModulos() {
		return numModulos;
	}

	public void setNumModulos(int numModulos) {
		this.numModulos = numModulos;
	}
	
	@Override
	public String exibir() {
		String resultado = super.exibir() +
							"\nNúmero de Módulos: " + this.getNumModulos();
		return resultado;
	}
	
}

package br.com.seniorsolution.classes;

public class CursoPos extends Curso{
	
	private int numModulos;
	
	public CursoPos(int codigo, String descricao, int cargaHoraria, int numModulos ) throws IllegalAccessException{
		super(codigo, descricao, cargaHoraria);
		this.setNumModulos(numModulos);
	}
	

	public int getNumModulos() {
		return numModulos;
	}

	public void setNumModulos(int numModulos) {
		this.numModulos = numModulos;
	}
	
	public String exibir(){
		String resultado = super.exibir() + "\n Numero de Modulos : "+this.numModulos;
		
		return resultado;
	}
	
}

package br.com.seniorsolution.classes;

public abstract class Curso {
	private int codigo;
	private String titulo;
	private int cargaHoraria;
	
	public Curso(int codigo, String titulo, int cargaHoraria)throws IllegalAccessException{
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		
		try{
		this.setCargaHoraria(cargaHoraria);
		}catch(IllegalAccessException e){
			e.initCause(new NumberFormatException("A carga horaria deve ser um numero positivo"));
			throw e;
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) throws IllegalAccessException{
		if(cargaHoraria <= 0){
			throw new IllegalAccessException("Carga horária inválida");
		}
		this.cargaHoraria = cargaHoraria;
	}
	
	public String exibir() {
		String resultado = "Código: " + this.getCodigo()
							+"\nTítulo: " + this.getTitulo()
							+"\nCarga Horária: " + this.getCargaHoraria();
		return resultado;
	}
}

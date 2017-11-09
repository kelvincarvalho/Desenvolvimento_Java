package br.com.seniorsolution.classes;

public class Curso implements Comparable<Curso>{
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso(int codigo, String descricao, int cargaHoraria) 
			throws IllegalAccessException {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		
		try {
			this.setCargaHoraria(cargaHoraria);
		} catch (IllegalAccessException e) {
			e.initCause(new NumberFormatException(
					"A carga hor�rio deve ser um n�mero positivo"));
			throw e;
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) 
			throws IllegalAccessException {
		if(cargaHoraria  <= 0){
			throw new IllegalAccessException("Carga hor�ria inv�lida!!");
		}
		this.cargaHoraria = cargaHoraria;
	}
	
	public String exibir() {
		String resultado = "C�digo: " + this.getCodigo() +
						   "\nDescri��o: " + this.getDescricao() +
						   "\nCarga Hor�ria: " + this.getCargaHoraria();
		
		return resultado;
	}

	@Override
	public String toString() {
		return this.getCodigo() + "-" + this.getDescricao();
	}

	@Override
	public int compareTo(Curso arg0) {
		
		return this.getDescricao().compareTo(arg0.getDescricao());
	}	
	
}

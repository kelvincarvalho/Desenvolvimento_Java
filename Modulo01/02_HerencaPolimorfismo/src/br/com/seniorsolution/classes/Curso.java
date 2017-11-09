package br.com.seniorsolution.classes;

public class Curso {

	private int codigo;
	private String descricao;
	private int cargaHoraria;
	
	
	
	
	public Curso(int codigo, String descricao, int cargaHoraria) throws IllegalAccessException {
		
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		try {
			this.setCargaHoraria(cargaHoraria);
		} catch (IllegalAccessException e) {
			e.initCause(new NumberFormatException("Carga horária deve ser um numero positivo")); //PERMITE QUE AGREGUE NO ERRO, ASCRENCENTA O ALGO NO ERRO
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
	
	public void setCargaHoraria(int cargaHoraria) throws IllegalAccessException  {
		if(cargaHoraria <= 0){
			throw new IllegalAccessException("Carga horária inválida!");
		}
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public String exibir (){
		String resultado = "Código : "+ this.getCodigo()+"\nDescrição : "+this.descricao+"\n Carga Horaria : "+ this.cargaHoraria;
		
		return resultado;
	}
	
	
	
	
	
}

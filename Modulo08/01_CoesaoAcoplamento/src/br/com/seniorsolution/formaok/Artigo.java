package br.com.seniorsolution.formaok;


public class Artigo {
	
	private String titulo;
	private int paginas;
	private String conteudo;
	private Pessoa autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Pessoa getAutor() {
		return autor;
	}
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}
	
	public String getInfo() {
		
		return "Dados do Artigo: "+"\nAutor"+this.getAutor().getNome()+"\nTitulo: "+this.getTitulo()+
				"\nConteudo: "+this.getConteudo()+"\n Ocupação: "+this.getAutor().getClass().getSimpleName();
	}
	
}

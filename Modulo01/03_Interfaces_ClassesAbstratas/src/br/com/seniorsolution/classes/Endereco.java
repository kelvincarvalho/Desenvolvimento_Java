package br.com.seniorsolution.classes;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String cidade;
	
	public Endereco(String logradouro, int i, String cidade){
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String exibir(){
		String endCompleto = "Endereço: " + this.getLogradouro() + ", ";
		endCompleto += this.getNumero() +"\n";
		endCompleto += this.getCidade();
		return endCompleto;
	}
	
}

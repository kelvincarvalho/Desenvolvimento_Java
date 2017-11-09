package br.com.seniorsolution.classes;

public class Endereco 
{
	private String logradouro;
	private int numero;
	private String cidade;
	
	public Endereco(String logradouro, int numero, String cidade)
	{
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
	}

	public String getLogradouro() 
	{
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) 
	{
		this.logradouro = logradouro;
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public String getCidade() 
	{
		return cidade;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	
	public String exibir() 
	{
		String resposta = "Logradouro: " + this.getLogradouro() + 
						  "\nNúmero: " + this.getNumero() + 
						  "\nCidade: " + this.getCidade();
		
		return resposta;
	}
	
	@Override
	public String toString() {
		
		return this.getLogradouro() + " - " + 
				this.getNumero() + " - " + 
				this.getCidade();
	}

	@Override
	public int hashCode() {
		
		return this.getLogradouro().hashCode() +
				this.getNumero() + 
				this.getCidade().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Endereco){
			Endereco end = (Endereco)obj;
			if(this.getLogradouro().equals(end.getLogradouro()) && 
					this.getNumero() == end.getNumero() && 
					this.getCidade().equals(end.getCidade())){
				
				return true;
			}
		}
		return false; 
	}

	
	
}

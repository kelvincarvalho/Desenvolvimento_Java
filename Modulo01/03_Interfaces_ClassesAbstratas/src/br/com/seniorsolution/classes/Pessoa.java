package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public abstract class Pessoa {
	
	//encapsulamento:
	//vari�veis como private pra validar obrigatoriamente pela classe Pessoa
	private int id; //identificador APENAS para o objeto
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;

	private static int contador =1;
	
	//construtor: deve ter o mesmo nome da classe, sem tipo de retorno espcificado
	//construtor padr�o: zero pra todos os n�meros, 
	//nulo pra todas as referencias e false pra booleans
	
	public Pessoa(String nome) {//pode ter par�metro ou n�o
		this.setId(contador++);
		this.setNome(nome);
	}
	
	public Pessoa (String nome, int idade) {
		this(nome);
		this.setIdade(idade);
	}
	
	public Pessoa (String nome, int idade, Sexo sexo) {
		this(nome,idade);
		this.setSexo(sexo);
	}
	
	public Pessoa (String nome, int idade, Sexo sexo, Endereco endereco) {
		this(nome,idade,sexo);
		this.setEndereco(endereco);
	}
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().equals("")){
			throw new IllegalArgumentException("Nome inv�lido");
		}
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade<0) {
			throw new IllegalArgumentException("Idade n�o pode ser negativa!");
		}else
		this.idade = idade;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if(endereco == null){
			throw new NullPointerException("Endere�o inv�lido");
		}
		this.endereco = endereco;
	}
	
	//gerar um ~relat�rio sobre o objeto
	public String exibir(){
		String titulo = "DADOS PESSOAIS";
		return exibir(titulo);
	}
	
	public String exibir(String titulo){
		String relatorio = titulo + "\n\nID: "+ this.getId() +"\nNome: " + this.getNome() + "\n";
		relatorio += "Idade: " + this.getIdade() + "\n";
		relatorio += "Sexo: " + this.getSexo() + "\n\n";
		if (this.getEndereco()!= null) relatorio += this.getEndereco().exibir(); //execu��o encadeada
		return relatorio;
	}
	
}
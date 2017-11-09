package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Pessoa {
	
	private int id; //IDENTIFICADOR PARA O OBJETO
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	private static int CONTADOR =1;
	
	//CONSTRUTOR: DEVER TER O MESMO NOME DA CLASSE, SEM TIPO DE RETORNO ESPECIFICADO
	//SE NENHUM CONSTRUTOR FOR INCLUIDO NA CLASSE O COMPILADOR INSERE O CONSTRUTOR PADRAO (SEM PARAMETROS) CUJO OBJETIVO É ATRIBUIR VALORES DEFAULT PARA OS ATRIBUTOS
	//QUANDO O USUARIO COLOCAR PELO MENOS UM CONSTRUTOR NA CLASSE, O COMPILADOR O UTILIZARA E DEIXARA DE INSERIR SEU CONSTRUTOR PADRAO
	
	public Pessoa(String nome) {
		this.setId(CONTADOR++);
		this.setNome (nome);
	}
	
	public Pessoa (String nome, int idade){
		this(nome);
		this.setIdade(idade);
	}
	
	public Pessoa (String nome, int idade, Sexo sexo){
		this(nome, idade);
		this.setSexo(sexo);
	}
	
	public Pessoa (String nome, int idade, Sexo sexo, Endereco endereco){
		this(nome, idade, sexo);
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
			throw new IllegalArgumentException("O campo nome é obrigatório!");
		}
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade <0){
			throw new NumberFormatException("Idade não pode ser negativa");
		}
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
			throw new NullPointerException("Endereço Inválido");
		}
		this.endereco = endereco;
	}

	
	public String exibir(){
		
		return exibir("DADOS PESSOAIS");
		
	}
	
	public String exibir(String titulo){
		
		String resposta = titulo + "\n\nID: "+this.getId() +
							"\nNome: "+this.getNome() +
							"\nIdade: "+ this.getIdade()+
							"\nSexo: "+ this.getSexo();
			if(this.getEndereco() != null){
				resposta += "\n\nENDEREÇO \n"+this.getEndereco().exibir();
			}
							
		
		return resposta;	
	}
}

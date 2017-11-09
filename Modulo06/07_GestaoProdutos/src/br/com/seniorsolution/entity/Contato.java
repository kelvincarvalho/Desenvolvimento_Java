package br.com.seniorsolution.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agenda")
public class Contato implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nome")
	private String nome;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="idade")
	private int idade;
	
	@Column(name="email")
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
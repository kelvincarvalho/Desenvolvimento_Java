package br.com.seniorsolution.entidades;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	@NotNull @NotEmpty @Size(min=2, max=42, message="{erro.usuario.nome}")
	private String nome;
	
	@NotNull @NotEmpty @Size(min=2, max=42, message="{erro.usuario.senha}")
	private String senha;
	private String nivel;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() throws NoSuchAlgorithmException {
		
		return Usuario.gerarMD5(senha);
	}
	public void setSenha(String senha) {
		
		this.senha = senha;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
	public static String gerarMD5(String senha) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(senha.getBytes(), 0, senha.length());
		return new BigInteger(1,m.digest()).toString(16);
	}
	
}

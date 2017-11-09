package br.com.seniorsolution.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Anuncio implements Prototype<Anuncio> {
	private String nome;
	private Calendar data;
	private Set<String> palavrasChave;
	
	public Anuncio(String nome, Calendar data, Set<String> palavras) {
		this.nome = nome;
		this.data = data;
		this.palavrasChave = palavras;
	}
	
	public String getNome() {
		return nome;
	}

	public Calendar getData() {
		return data;
	}

	public Set<String> getPalavrasChave() {
		return palavrasChave;
	}

	public Anuncio clone () {
		String nome = "C�pia do anuncio: "+this.getNome();
		Calendar data =  (Calendar) this.data.clone();
		Set<String> palavras = new HashSet<>(this.getPalavrasChave());
		
		return new Anuncio(nome, data, palavras);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Anuncio: ");
		sb.append(this.getNome());
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String data = df.format(this.getData().getTime());
		
		sb.append("\nData: ");
		sb.append(data);
		sb.append("\nPalavras-Chave: \n");
		
		for(String palavra : this.getPalavrasChave()) {
			sb.append("  ");
			sb.append(palavra);
			
		}
		return sb.toString();
	}
	
}
package br.com.seniorsolution.multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Tema {
	
	private String nome;
	private Color corFundo;
	private Color corFonte;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Color getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(Color corFundo) {
		this.corFundo = corFundo;
	}

	public Color getCorFonte() {
		return corFonte;
	}

	public void setCorFonte(Color corFonte) {
		this.corFonte = corFonte;
	}

	public static Map<String, Tema> getTemas() {
		return temas;
	}

	public static void setTemas(Map<String, Tema> temas) {
		Tema.temas = temas;
	}

	public static final String TemaClaro = "CLARO";
	public static final String TemaEscuro = "ESCURO";
	
	private static Map<String, Tema> temas = new HashMap<>();
	
	//BLOVO DE INICIALIZAÇÃO ESTATICA: EXECUTADO ANTES DO CONSTRUTOR E SUA ORDDEM NA CLASSE É IMPORTANTE
	static {
		Tema tema1 = new Tema();
		tema1.setNome(TemaClaro);
		tema1.setCorFundo(Color.cyan);
		tema1.setCorFonte(Color.BLUE);
		
		Tema tema2 = new Tema();
		tema2.setNome(TemaEscuro);
		tema2.setCorFundo(Color.BLACK);
		tema2.setCorFonte(Color.GREEN);
		
		temas.put(tema1.getNome(), tema1);
		temas.put(tema2.getNome(), tema2);
		
	}
	
	private Tema() {
	}
	
		public static Tema getInstance(String nomeTema){
			return  temas.get(nomeTema);
		
	}
	
}

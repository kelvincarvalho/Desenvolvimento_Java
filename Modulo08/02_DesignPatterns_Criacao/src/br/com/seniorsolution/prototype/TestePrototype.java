package br.com.seniorsolution.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestePrototype {
	
	//PADRAO PROTOTYPE: permite a copia de um objeto a partir de outro existente
	
	public static void main(String[] args) {
		String nome = "Muito sono disponivel";
		Calendar data =  Calendar.getInstance();
		Set<String> palavras =  new HashSet<>();
		palavras.add("sono");
		palavras.add("cara bom");
		palavras.add("dormir");
		
		Anuncio anuncio = new Anuncio(nome, data, palavras);
		System.out.println(anuncio);
		System.out.println();
		
		Anuncio copia = anuncio.clone();
		System.out.println(copia);

	}

}

package br.com.seniorsolution.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet03 {
	public static void main(String[] args) {
		Set<String> nomes = new LinkedHashSet<>();
		
		nomes.add("Fabiana");
		nomes.add("Daniel");
		nomes.add("Nicholas");
		nomes.add("Emilio");
		nomes.add("Fabio");
		nomes.add("Joaquim");
		nomes.add("Adriana");
		nomes.add("Mario");
		
		for (String item: nomes) {
			System.out.println(item);
		}
		
	}

}

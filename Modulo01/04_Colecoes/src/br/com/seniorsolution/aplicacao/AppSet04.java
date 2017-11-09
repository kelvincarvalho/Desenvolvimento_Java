package br.com.seniorsolution.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet04 {
	public static void main(String[] args) {
		Set<String> nomes = new TreeSet<>();
		
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

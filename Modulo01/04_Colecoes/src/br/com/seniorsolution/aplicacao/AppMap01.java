package br.com.seniorsolution.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap01 {
	public static void main(String[] args) {
		
		//Igual o Set porém com conjunto de chave / valor
		//LinkedHashMap e TreeMap 
		//funciona da mesma forma que Linked e Tree Set
		Map<Integer, String> nomes = new HashMap<>();
		
		nomes.put(125, "Fabiana");
		nomes.put(30, "Daniel");
		nomes.put(50, "Nicholas");
		nomes.put(371, "Emilio");
		nomes.put(4, "Fabio");
		nomes.put(110, "Joaquim");
		nomes.put(901, "Adriana");
		nomes.put(16, "Mario");
		
		//Retorno do entrySet = Set<Entry<Integer, String>>
		for (Map.Entry<Integer, String> item: nomes.entrySet()) {
			System.out.println(item.getKey() + " - " + item.getValue());
			
		}
		
	}
}

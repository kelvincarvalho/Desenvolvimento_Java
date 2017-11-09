package br.com.seniorsolution.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppLista01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Leonardo1");
		nomes.add("Leonardo2");
		nomes.add("Leonardo3");
		nomes.add("Leonardo4");
		
		nomes.add(0, "Leonardo0");
		
		nomes.remove(1);
		
		nomes.add("Leonardo5");
		nomes.add("Leonardo6");
		nomes.add("Leonardo7");
		
		nomes.remove("Leonardo4");
		
		Collections.sort(nomes);
		
		for(String item : nomes){
			System.out.println(item);
		}
		
		
	}
}

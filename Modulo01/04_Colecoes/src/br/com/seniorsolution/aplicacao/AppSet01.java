package br.com.seniorsolution.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		
		Set<String> nomes  =  new HashSet<>();
		
		System.out.println(nomes.add("Fabiana"));
		System.out.println(nomes.add("Daniel"));
		System.out.println(nomes.add("Nicholas"));
		System.out.println(nomes.add("Emilio"));
		System.out.println(nomes.add("Fabio"));
		System.out.println(nomes.add("Joaquim"));
		System.out.println(nomes.add("Adriana"));
		System.out.println(nomes.add("Mario"));
		System.out.println(nomes.add("Mario"));
		
		System.out.println("-----------------------------------------------");
		
		for (String item: nomes) {
			System.out.println(item);
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("Fabiana".hashCode());
		System.out.println("Daniel".hashCode());
		System.out.println("Nicholas".hashCode());
		System.out.println("Emilio".hashCode());
		System.out.println("Fabio".hashCode());
		System.out.println("Joaquim".hashCode());
		System.out.println("Adriana".hashCode());
		System.out.println("Mario".hashCode());
		
		
	}

}

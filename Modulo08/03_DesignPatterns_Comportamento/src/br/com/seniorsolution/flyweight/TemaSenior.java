package br.com.seniorsolution.flyweight;

import java.util.Arrays;

public class TemaSenior implements TemaFlyweight {
	
	@Override
	public void imprimir(String titulo, String texto) {
		System.out.println("xxxxxxx "+titulo+" xxxxxxxxx");
		System.out.println(texto);
		char [] rodape = new char [22+titulo.length()];
		Arrays.fill(rodape, 'x');
		System.out.println(rodape);
}
}

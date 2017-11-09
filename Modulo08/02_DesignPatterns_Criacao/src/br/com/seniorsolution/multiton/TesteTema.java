package br.com.seniorsolution.multiton;

public class TesteTema {

	public static void main(String[] args) {
		// Padrão Multotlon: permite obter uma instacia dentre uma cole~ção de instacias
		
		Tema temaClaro = Tema.getInstance(Tema.TemaClaro);
		System.out.println("INFORMAÇÕES - TEMA CLARO");
		System.out.println("Tema: "+temaClaro.getNome());
		System.out.println("Cor da Fonte: "+temaClaro.getCorFonte());
		System.out.println("Cor de Fundo: "+temaClaro.getCorFundo());
		
		System.out.println();
		
		Tema temaEscuro = Tema.getInstance(Tema.TemaEscuro);
		System.out.println("INFORMAÇÕES - TEMA ESCURO");
		System.out.println("Tema: "+temaEscuro.getNome());
		System.out.println("Cor da Fonte: "+temaEscuro.getCorFonte());
		System.out.println("Cor de Fundo: "+temaEscuro.getCorFundo());
		
		/*Tema tClaro = Tema.getInstance(Tema.TemaClaro);
		System.out.println("INFORMAÇÕES - TEMA CLARO");
		System.out.println("Tema: "+temaClaro.getNome());
		System.out.println("Cor da Fonte: "+temaClaro.getCorFonte());
		System.out.println("Cor de Fundo: "+temaClaro.getCorFundo());*/
	}

}

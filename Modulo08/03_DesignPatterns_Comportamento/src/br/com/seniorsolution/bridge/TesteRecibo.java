package br.com.seniorsolution.bridge;

public class TesteRecibo {
	public static void main(String[] args) {
		
		//PATTER BRIDGE
		//ESTE OBJETO (GERADOR ARQUIVOS)� A PONTE (BRIDGE) ENTRE AS INFORMA��ES DO RECIBO E O FORMATO A SER GERADO COM O  ARQUIVO
		GeradorAquivos geradorAquivos = new GeradorArquivosTxt();
		
		Recibo recibo = new Recibo("FIAP", "KELVIN", 500, geradorAquivos);
		recibo.gerarArquivo();
		System.out.println("OK");
	}
}

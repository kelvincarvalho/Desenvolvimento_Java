package br.com.seniorsolution.flyweight;

public class TesteTemas {
	public static void main(String[] args) {
		//PARTTERN FLYWEIGHT: UTILIZADO EM SITUAÇÕES ONDE EXISTE UMA GRANDE QUANTIDADE DE OBJETOS A SEREM REUTILIZADOS
		//ESSES OBJETOS SAO CRIADOS OU REAPROVEITADOS CASO EXISTAM.
		
		ConjuntoDocumentos documentos = new ConjuntoDocumentos();
		
		documentos.adicionarDocumento(new Documento(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO), 
				"TITULO COM ***", "Exemplo de tema com **"));
		
		documentos.adicionarDocumento(new Documento(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
				"TITULO COM -", "Exemplo de tema com -"));
		
		documentos.adicionarDocumento(new Documento(TemaFlyweightFactory.getTema(TemaFlyweightFactory.SENIOR), 
				"TITULO COM SENIOR", "Exemplo de tema com SENIOR"));
		
		documentos.imprimir();
	}
}

package br.com.seniorsolution.bridge;

public class Recibo implements Documento {

	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorAquivos geradorAquivos;
	
	
	public Recibo(String emissor, String favorecido, double valor, GeradorAquivos geradorAquivos) {
		
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorAquivos = geradorAquivos;
	}



	@Override
	public void gerarArquivo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Recibo");
		sb.append("\r\nEmissor: ");
		sb.append(this.emissor);
		sb.append("\r\nFavorecido: ");
		sb.append(this.favorecido);
		sb.append("\r\nValor: ");
		sb.append(this.valor);
		this.geradorAquivos.gerar(sb.toString());
		
		
/*		try {
			
			FileWriter writer = new FileWriter("C:\\Desenvolvimento_Java\\Modulo08\\recibo.txt");
			writer.write("Recibo ");
			writer.write("\r\nEmissor: "+this.emissor);
			writer.write("\r\nFavorecido: "+this.favorecido);
			writer.write("\r\nValor: "+this.valor);
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
*/		
	}

}
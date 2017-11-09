package br.com.seniorsolution.bridge;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorArquivosTxt implements GeradorAquivos {

	
	
	@Override
	public void gerar(String conteudo) {
		
		try {
			
			String arquivo = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
			FileWriter writer = new FileWriter("C:\\Desenvolvimento_Java\\Modulo08\\"+arquivo+".txt");
			writer.write(conteudo);
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package br.com.seniorsolution.aplicacao;

import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.enumeracoes.Sexo;

class AppGerarArquivos {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Leonardo", 20, Sexo.MASCULINO, 1234578910, new Curso(10, "ADS", 6000));
			
			Set<Curso> cursosAnteriores = new LinkedHashSet<>();
			cursosAnteriores.add(new Curso(120, "Mecatrônica", 3000));
			cursosAnteriores.add(new Curso(130, "HTML e CSS", 40));
			cursosAnteriores.add(new Curso(140, "Maven", 24));
			cursosAnteriores.add(new Curso(150, "NodeJS", 12));
			
			aluno.setOutrosCursos(cursosAnteriores);
			
			System.out.println(aluno.exibir());
			
			//gerar as informações deste aluno em um arquivo texto
			
			FileWriter writer = new FileWriter("C:\\Desenvolvimento_Java\\aluno.txt");
			writer.write(aluno.exibir());
			writer.close(); //executa o método flush()
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

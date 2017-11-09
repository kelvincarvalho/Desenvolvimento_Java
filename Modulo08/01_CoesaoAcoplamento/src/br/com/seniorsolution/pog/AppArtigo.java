package br.com.seniorsolution.pog;

public class AppArtigo {

	public static void main(String[] args) {
		//DEFININDO UM ARTIGO ESCRITO POR UM PROFESSOR
		
		Professor p = new Professor();
				p.setNome("Emilio");
				p.setDisciplina("Java");
				
				Artigo a1= new Artigo();
				a1.setTitulo("Java 9");
				a1.setConteudo("Vai Estudar");
				a1.setPaginas(5);
				a1.setAutor(p);
				
		//DEFININDO UM ARTIGO ESCRITO POR UM ALUNO
				Aluno a = new Aluno();
				a.setNome("Kelvin");
				a.setCurso("SI");
				
				ArtigoAluno a2= new ArtigoAluno();
				a2.setTitulo("Java 9");
				a2.setConteudo("Vai Estudar");
				a2.setPaginas(5);
				a2.setAutor(a);		

	}

}

package br.com.seniorsolution.formaok;

import javax.swing.JOptionPane;

public class AppArtigo {

	public static void main(String[] args) {
		Artigo artigo = new Artigo();
		artigo.setTitulo("Design Patterns");
		artigo.setConteudo("Existem diversos design patterns");
		artigo.setPaginas(30);
		
		Pessoa pessoa = new Professor();
		pessoa.setNome("Kelvin");
		artigo.setAutor(pessoa);
		
		JOptionPane.showMessageDialog(null, artigo.getInfo());
	}

}
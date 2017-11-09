package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.classes.CursoPos;

public class AppPolimorfismo {

	public static void main(String[] args) {
		
		try {
			Curso curso = new CursoPos(100, "Gestao de Processos", 360, 20);
			
			if(curso instanceof CursoPos){
				((CursoPos)curso).setNumModulos(22); //OK
				JOptionPane.showMessageDialog(null, curso.exibir());
			}
			if(curso instanceof CursoGraduacao){
				((CursoGraduacao)curso).setNumeroSemestres(2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;

public class AppCursos {

	public static void main(String[] args) {
		
		
		try {
			Curso curso = new Curso (10,"Java", 0);

			
			JOptionPane.showMessageDialog(null, curso.exibir());
			
			
			CursoGraduacao cursoG = new CursoGraduacao(20,"Engenharia", 4000,10);

			
			JOptionPane.showMessageDialog(null, cursoG.exibir());
			
			Curso curso2 = new CursoGraduacao(30,"Psicologia",3200,8);
			//curso2.setCodigo(30);
			//curso2.setDescricao("Psicologia");
			//curso2.setCargaHoraria(3200);
			
			//E PARA ATRIBUIR VALOR PARA O NUMERO DE SEMESTRES?
			//CursoGraduacao cursoG2 = (CursoGraduacao) curso2;
			//cursoG2.setNumeroSemestres(8);
			
			//EXECUTANDO DE FORMA DIRETA...
			//((CursoGraduacao)curso2).setNumeroSemestres(9);
			
			JOptionPane.showMessageDialog(null, curso2.exibir());
			
			//E NESTE CASO?
			Object pessoaObj = new CursoGraduacao(40, "TI", 3000,6);
			CursoGraduacao pessoaObj2 = (CursoGraduacao) pessoaObj;
			
			JOptionPane.showMessageDialog(null, pessoaObj2.exibir());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

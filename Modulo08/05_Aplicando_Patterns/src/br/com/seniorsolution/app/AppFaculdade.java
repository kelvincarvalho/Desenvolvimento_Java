package br.com.seniorsolution.app;



import javax.swing.JOptionPane;

import br.com.seniorsolution.curso.CursoCiencia;
import br.com.seniorsolution.curso.CursoSistemas;
import br.com.seniorsolution.curso.Disciplina;
import br.com.seniorsolution.curso.Pool;



public class AppFaculdade {

	public static void main(String[] args) {
		int TotalDisciplina =0;
		int resposta=0;
		resposta= Integer.parseInt(JOptionPane.showInputDialog("Escolha o Curso\n\n1-Sistemas de Informação\n2-Ciencia da Computação"));
		
		switch(resposta) {
		case 1:
			Pool<Disciplina> pool = new CursoSistemas();
			Disciplina disciplina = pool.ocupar();
			
			System.out.println("--CURSO SISTEMAS DE INFORMAÇAO--");
			while(disciplina !=null) {
				JOptionPane.showConfirmDialog(null, disciplina.getNomeDisciplina());
				disciplina = pool.ocupar();
			}
			break;
		
		case 2: 
			Pool<Disciplina> pool2 = new CursoCiencia();
			Disciplina disciplina2 = pool2.ocupar();
			
			System.out.println("--CURSO CIENCIA--");
			while(disciplina2 !=null) {
				int option = JOptionPane.showConfirmDialog(null, disciplina2.getNomeDisciplina());
				if(option ==JOptionPane.YES_OPTION) {
					TotalDisciplina+= 1;
				}
				disciplina2 = pool2.ocupar();
				
			}
			break;
				
		}
	
		JOptionPane.showMessageDialog(null, "Total Disciplina "+TotalDisciplina);

		
		
		
	}

}

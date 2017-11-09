package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.enumeracoes.TipoObjeto;
import br.com.seniorsolution.utilitarios.Utils;

public class AppUtils {

	public static void main(String[] args) {
		
		try {
			Object obj = Utils.buscarObjeto(TipoObjeto.CURSOGRAD);
			if(obj != null && obj instanceof Curso){
				JOptionPane.showMessageDialog(null, ((Curso)obj).exibir());
			}
			
			Aluno aluno = (Aluno)Utils.buscarObjeto(TipoObjeto.ALUNO); //MAIS ARRISCADO
			JOptionPane.showMessageDialog(null, aluno.exibir());
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

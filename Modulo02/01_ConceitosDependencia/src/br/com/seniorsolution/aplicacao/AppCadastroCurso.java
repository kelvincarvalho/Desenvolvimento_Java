package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.dao.AlunosDao;

public class AppCadastroCurso {
	public static void main(String[] args) {
		while(true){
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir um novo curso?", "Cadastro Cursos", JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.NO_OPTION){
				break;
			}
			
			
			try {
				AlunosDao dao = new AlunosDao();
				
				Aluno aluno = (Aluno)JOptionPane.showInputDialog(null, "Selecione o Aluno", "Alunos", JOptionPane.QUESTION_MESSAGE, null, dao.listarAlunos().toArray(), null);
				
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do curso"));
				String descricao= JOptionPane.showInputDialog(null, "Digite a nome do curso");
				int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a carga horaria do curso"));
				
				Curso curso = new Curso(codigo, descricao, cargaHoraria);
				
				dao.incluirCurso(curso, aluno);
				
				JOptionPane.showMessageDialog(null, "Curso incluído com sucesso");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro");
				e.printStackTrace();
			}
		}
	}
}

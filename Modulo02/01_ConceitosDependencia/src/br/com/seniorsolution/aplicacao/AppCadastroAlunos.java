package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.dao.AlunosDao;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppCadastroAlunos {
	public static void main(String[] args) {
	
		while(true){
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir um novo aluno?", "Cadastro Alunos", JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.NO_OPTION){
				break;
			}
			int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matricula do aluno"));
			String nome = JOptionPane.showInputDialog(null, "Digite a nome do aluno");
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno"));
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, "Sexo do Aluno", "Sexo", JOptionPane.QUESTION_MESSAGE, null, Sexo.values(), null);
			
			try {
				new AlunosDao().incluirAluno(new Aluno(nome, idade, sexo, matricula, null));
				JOptionPane.showMessageDialog(null, "Aluno incluído com sucesso");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro");
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}

package br.com.seniorsolution.aplicacao;


import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppExcecoes {

	public static void main(String[] args) {
		
		try {
			Pessoa p = new Pessoa("KELVIN", -10, Sexo.MASCULINO);
			JOptionPane.showMessageDialog(null, p.exibir());
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

}

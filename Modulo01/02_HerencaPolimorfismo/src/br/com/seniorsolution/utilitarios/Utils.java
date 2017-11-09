package br.com.seniorsolution.utilitarios;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.classes.CursoPos;
import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;
import br.com.seniorsolution.enumeracoes.TipoObjeto;

public class Utils {
	public static Object buscarObjeto (TipoObjeto tipo) throws Exception {
		Object objeto;
		
		switch (tipo){
			case PESSOA: 
				objeto = new Pessoa("Kelvin", 19, Sexo.MASCULINO);
			break;
			case FUNCIONARIO:
				objeto = new Funcionario("Kelvin", 19, Sexo.MASCULINO, 41395044, "estagiario", 100);
			break;
			
			case ALUNO:
				objeto = new Aluno("Kelvin", 19, Sexo.MASCULINO, 76720, "Sistemas de Informacao");
			break;
			
			case CURSOGRAD:
				objeto = new CursoGraduacao(123, "Sistemas de Informacao", 20000, 8);
			break;
			
			case CURSOPOS:
				objeto = new CursoPos(321, "SI - BD", 360, 2);
				break;
			default: objeto = null;
			
		}
		
		return objeto;
	}
}

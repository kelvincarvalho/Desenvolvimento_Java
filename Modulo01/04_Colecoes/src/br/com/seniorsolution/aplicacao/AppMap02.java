package br.com.seniorsolution.aplicacao;

import java.util.Map;
import java.util.TreeMap;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppMap02 {
	public static void main(String[] args) {
		
		Map<Pessoa, String> pessoas = new TreeMap<>();
		
		try {
			
			pessoas.put(
					new Aluno("Joao", 23, Sexo.MASCULINO, 123, 
							new Curso(100, "PHP", 40)), "Joao PHP");
			
			pessoas.put(
					new Funcionario("Cardoso", 40, Sexo.MASCULINO, 
							"12345678910", "Motorista", 4000), "Motorista");
			pessoas.put(
					new Funcionario("Barbara", 32, Sexo.FEMININO, 
							"01987654321", "Gerente", 12000), "Gerente PJ");
			
			for (Map.Entry<Pessoa, String> item: pessoas.entrySet()) {
				
				System.out.println(item.getKey() + " - " + item.getValue());
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

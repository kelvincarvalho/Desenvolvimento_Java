package br.com.seniorsolution.objectpool;

import java.util.ArrayList;

public class FuncionarioPool implements Pool<Funcionario> {
	
	java.util.List<Funcionario> funcionarios;
	
	public FuncionarioPool() {
		
		
		funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("Cleber", "Motorista"));
		funcionarios.add(new Funcionario("Debora", "Analista"));
		funcionarios.add(new Funcionario("Kelvin", "Estagiario"));
		
	}
	
	@Override
	public Funcionario ocupar() {
		if(funcionarios.size() >0) {
			return this.funcionarios.remove(0);
		}
		return null;
	}

	@Override
	public void liberar(Funcionario t) {
		funcionarios.add(t);
		
	}
	
}

package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Funcionario extends Pessoa {
	
	private int cpf;
	private String cargo;
	private double salario;
	
	
public Funcionario(String nome, int idade, Sexo sexo, int cpf, String cargo, double salario) throws IllegalAccessException {
		
		super(nome, idade, sexo);
		this.setCpf(cpf);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) throws IllegalAccessException {
		
		if( Integer.toString(cpf).trim().length() != 11){
			throw new IllegalAccessException("CPF deve ter 11 digitos");
		}
		
		this.cpf = cpf;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	@Override
	public String exibir(){
		
		String resultado = super.exibir() + "\ncpf: "+this.getCpf() 
						+"\nCargo : "+this.getCargo() + 
						"\nSalario : "+this.getSalario();
		
	return resultado;
	}

	
	
	

}

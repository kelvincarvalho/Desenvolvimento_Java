package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Funcionario extends Pessoa{


	private String cpf;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, int idade, Sexo sexo, String cpf, String cargo, double salario) throws IllegalAccessException{
		super(nome,idade,sexo);
		this.setCpf(cpf);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(String nome, int idade, Sexo sexo, String cpf, String cargo, double salario, Endereco endereco) throws IllegalAccessException{
		this(nome,idade,sexo, cpf,cargo, salario);
		this.setEndereco(endereco);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws IllegalAccessException {
		if(cpf.trim().length() != 11){
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
	
	@Override //sinaliza pro compilador que o m�todo � sobrescrito
	public String exibir() {
		String resultado = super.exibir() +
							"\nCPF: " + this.getCpf() +
							"\nCargo: " + this.getCargo() +
							"\nSal�rio: " + this.getSalario();
		return resultado;
	}
	
}

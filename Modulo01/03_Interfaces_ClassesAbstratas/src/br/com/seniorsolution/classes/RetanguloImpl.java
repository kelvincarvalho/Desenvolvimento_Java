package br.com.seniorsolution.classes;

import br.com.seniorsolution.interfaces.IFigura;

public class RetanguloImpl implements IFigura {
		
	private double base, altura;

	public RetanguloImpl(double base, double altura){
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return this.getBase()*this.getAltura();
	}
	
}

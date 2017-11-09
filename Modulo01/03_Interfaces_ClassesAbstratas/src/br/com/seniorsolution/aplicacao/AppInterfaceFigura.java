package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.RetanguloImpl;
import br.com.seniorsolution.interfaces.IFigura;

public class AppInterfaceFigura {
	public static void main(String[] args) {
		RetanguloImpl f1 = new RetanguloImpl(10, 10);
		IFigura f2 = new RetanguloImpl(16, 15);
		
		mostrarFigura(f1);
		mostrarFigura(f2);
	}
	
	private static void mostrarFigura(IFigura figura){
		String classe = figura.getClass().getSimpleName();
		String resultado = "A área da figura é: "+figura.calcularArea()+"\nE sua figura é um: "+classe;
		JOptionPane.showMessageDialog(null, resultado);
	}
	
}

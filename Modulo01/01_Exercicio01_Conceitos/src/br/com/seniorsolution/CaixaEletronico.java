package br.com.seniorsolution;


import javax.swing.JOptionPane;

public class CaixaEletronico {
	public static void main(String[] args) {
	/*
	 * Em um caixa eletr�nico, est�o dispon�veis notas
	 * de 5, 10, 20 e 50 reais. O usu�rio solicita um saque.
	 * Escreve o programa de forma a mostrar o n�mero de c�dulas dispensadas
	 * de cada valor, levando em conta a menor quantidade poss�vel de c�dulas.
	 */	
	double saque = 0;
	int notas, restos, cinquenta, vinte, dez, cinco;
	String resposta;
	notas = cinquenta = vinte = dez = cinco = 0;
	saque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque: "));
	
	if(saque % 5 == 0 && saque > 0){
		notas = ((int)saque / 50);
		cinquenta = notas;
		restos = ((int)saque % 50);
		notas += (restos / 20);
		vinte = (restos / 20);
		restos = (restos % 20);
		notas += (restos / 10);
		dez = (restos / 10);
		restos = (restos % 10);
		notas += (restos / 5);
		cinco = (restos / 5);
		resposta = "Saque retirado: "+ saque + "\nSua quantidade de notas ser�: " + notas + "\nCinquenta: " + cinquenta + "\nVinte: " + vinte + "\nDez: " + dez + "\nCinco: " + cinco;
	}else{
		resposta = "N�o temos notas suficientes para esta transa��o.";
	}
	JOptionPane.showMessageDialog(null, resposta);

	}
}

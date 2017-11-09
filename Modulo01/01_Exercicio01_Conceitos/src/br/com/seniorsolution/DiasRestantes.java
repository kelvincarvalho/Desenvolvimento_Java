package br.com.seniorsolution;

import javax.swing.JOptionPane;

public class DiasRestantes {
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));;
		int vetor[] = {31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String resposta = null;
		int total = 0;
		
		//valida��es
		if(mes < 1 || mes > 12){
			resposta = "M�s inv�lido";
		}
		if(dia < 1 || dia > vetor[mes - 1]){
			resposta = "Dia inv�lido para o m�s informado";
		}else{
			total += (vetor[mes] - dia)-1;
			for(int i = mes; i < 12; i++){
				total += vetor[i];
				resposta = "Total de dias restantes: " + total;
			}
		}
			JOptionPane.showMessageDialog(null, resposta);
	}
}

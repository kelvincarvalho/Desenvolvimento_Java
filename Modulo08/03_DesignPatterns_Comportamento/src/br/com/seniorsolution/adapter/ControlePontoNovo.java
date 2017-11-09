package br.com.seniorsolution.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControlePontoNovo {
	
	public void registrar(Funcionario f, boolean entrada) {
		Calendar calendar = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		String data = df.format(calendar.getTime());
		
		if(entrada) {
			System.out.println("Entrada: "+f.getNome()+ " �s "+data);
		}
		else {
			System.out.println("Saida: "+f.getNome()+ " �s "+data);
		}
		
	}
}

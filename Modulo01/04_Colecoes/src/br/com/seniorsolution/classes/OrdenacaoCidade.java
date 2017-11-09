package br.com.seniorsolution.classes;

import java.util.Comparator;

public class OrdenacaoCidade implements Comparator<Endereco>{

	@Override
	public int compare(Endereco arg0, Endereco arg1) {
		
		return arg0.getCidade().compareTo(arg1.getCidade());
	}
	
	
}

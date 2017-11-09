package br.com.seniorsolution.bean;

import java.util.List;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Contato;
import br.com.seniorsolution.entity.Produto;

public class ContatosBean {
	
	public List<Contato> getListaContatos(){
		return new GenericDao<>(Contato.class).listar();
	}
	
}

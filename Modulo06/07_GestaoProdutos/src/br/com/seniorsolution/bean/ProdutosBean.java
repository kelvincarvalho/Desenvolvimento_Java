package br.com.seniorsolution.bean;

import java.util.List;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Produto;

public class ProdutosBean {
	public List<Produto> getListaProdutos(){
		return new GenericDao<>(Produto.class).listar();
	}
}

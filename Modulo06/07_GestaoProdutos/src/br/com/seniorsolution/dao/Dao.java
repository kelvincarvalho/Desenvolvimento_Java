package br.com.seniorsolution.dao;

import java.util.List;

public interface Dao<T> {	
	void adicionar(T entidade);
	void excluir(T entidade);
	List<T> listar();
}

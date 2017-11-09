package br.com.seniorsolution.curso;

public interface Pool<T> {
	T ocupar();
	void liberar(T t);
}

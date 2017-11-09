package br.com.seniorsolution.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.seniorsolution.utils.JpaUtil;

public class GenericDao<T> implements Dao<T>{
	private final Class<T> classe;
	protected EntityManager em;
		
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	@Override
	public void excluir(T entidade) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();
		em.close();
	}
	
	@Override
	public void adicionar(T entidade) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<T> listar() {
		
		em = JpaUtil.getEntityManager();
		
		TypedQuery<T> query = em
			.createQuery("From " + classe.getSimpleName(),classe);
		List<T> lista = query.getResultList();
				
		em.close();	
		
		return lista;
	}
}
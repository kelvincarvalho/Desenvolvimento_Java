package br.com.seniorsolution.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.seniorsolution.utils.JpaUtil;


public class GenericDao<T> implements Dao<T> {

	private final Class<T> classe;
	protected EntityManager em;

	public GenericDao(Class<T> classe) {
		this.classe=classe;
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
		em =JpaUtil.getEntityManager();
		
		TypedQuery<T> query = em.createQuery("From " + classe.getSimpleName(),classe);
		List<T> lista = query.getResultList();
		
		
		return lista;
	}

	@Override
	public T buscar(int id) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = em.find(classe, id);
		em.getTransaction().commit();
		
		//em.close();
		return entidade;
	}

	@Override
	public T validar(String nome, String senha) {
		T entidade = null;
		try {
			em = JpaUtil.getEntityManager();
		
			TypedQuery<T> query = em
				.createQuery("From " + classe.getSimpleName() + 
					" Where nome= :nome and senha= :senha ",classe);
			query.setParameter("nome", nome);
			query.setParameter("senha", senha);
			
		
			entidade = query.getSingleResult();
		} catch(Exception e) {
			
		}
		em.close();				
		return entidade;

		
		
	}

	


}

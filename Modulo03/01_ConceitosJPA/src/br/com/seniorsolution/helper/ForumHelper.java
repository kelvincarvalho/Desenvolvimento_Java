package br.com.seniorsolution.helper;

import javax.persistence.EntityManager;

import br.com.seniorsolution.entidade.Forum;
import br.com.seniorsolution.entidade.Usuario;

public class ForumHelper {
	
	private EntityManager em;
	
	public ForumHelper(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Forum forum) throws Exception {
		
		em.getTransaction().begin(); //INICIA A TRANSA��O
		em.persist(forum); //PASSA O OBJETO FORUM, GRAVA NO BANCO DE DADOS //ESTADO: ATTACHED (CONECTADO)
		em.getTransaction().commit(); // FINALIZA A TRANSA��O
		
	}
	
	public void adcionarUsuario(int idForum, Usuario usuario)throws Exception {
		Forum f = em.find(Forum.class, idForum); //ESTADO PERSISTENT
		if( f != null) {
			usuario.setForum(f);
			f.getUsuarios().add(usuario);
			
			em.getTransaction().begin();
			em.persist(f);
			em.getTransaction().commit();
		}
		
	}
}

package br.com.seniorsolution.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.seniorsolution.entidade.Usuario;
import br.com.seniorsolution.helper.ForumHelper;

public class AppUsuario {

	public static void main(String[] args) {
		//CRIAREMOS UM USUARIO E O ADCIONAREMOS A UM FORUM EXISTENTE
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaForum");
		EntityManager em = emf.createEntityManager();
		
		try {
			Usuario usuario = new Usuario();
			usuario.setNome("Joaquim");
			usuario.setEmail("joaquim@emaildele.com.br");
			
			ForumHelper dao = new ForumHelper(em);
			dao.adcionarUsuario(1, usuario);
			
			System.out.println("OK");
			JOptionPane.showMessageDialog(null, "Usuario Adcionado!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

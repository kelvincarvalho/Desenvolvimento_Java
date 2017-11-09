package br.com.seniorsolution.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.seniorsolution.entidade.Forum;
import br.com.seniorsolution.entidade.Usuario;
import br.com.seniorsolution.helper.ForumHelper;

public class AppForum {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaForum");
		
		EntityManager em = emf.createEntityManager();
		
		try {
			Forum forum = new Forum(); //ESTADO: DETTACHED (DESCONECTADO)
			ForumHelper dao = new ForumHelper(em);
			
			//forum.setAssunto("Projeto JPA");
			//forum.setDescricao("Exemplo de JPA com Maven");
			forum.setAssunto("Problemas com JPA");
			forum.setDescricao("Busca de ajuda na solu��o de problemas");
			
			Usuario us1 = new Usuario();
			us1.setNome("Gerson");
			us1.setEmail("gerson@impacta.com.br");
			us1.setForum(forum);
			
			//CRIAMOS DOIS USUARIOS E FAZEMOS O VINCULO AO FORUM RECEM CRIADO
			Usuario us2 = new Usuario();
			us2.setNome("Ana");
			us2.setEmail("ana@seniorsolution.com.br");
			us2.setForum(forum);
			
			//ADICIONAMOS OS DOIS USUARIOS NA LISTA DE USUARIOS DO OBJETO FORUM
			forum.getUsuarios().add(us1);
			forum.getUsuarios().add(us2);
			
			dao.salvar(forum);
			
			System.out.println("OK");
			JOptionPane.showMessageDialog(null, "Forum incluido!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
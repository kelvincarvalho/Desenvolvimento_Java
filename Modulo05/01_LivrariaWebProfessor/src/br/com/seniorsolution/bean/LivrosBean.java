package br.com.seniorsolution.bean;

import java.io.InputStream;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Livro;

@ManagedBean(name="bLivro")
@RequestScoped
public class LivrosBean {

	private Livro livro;
	private Part part;
	
	public LivrosBean() {
		livro = new Livro();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Part getPart() {
		return part;
	}
	
	public void setPart(Part part) {
		this.part = part;
	}
	
	//action incluirLivro
	public String incluirLivro() {
		try {
			InputStream inputStream = part.getInputStream();
			byte[] imagem = new byte[(int)part.getSize()];
			
			inputStream.read(imagem, 0, (int)part.getSize());
			livro.setImagem(imagem);
			
			
			GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
			dao.adicionar(livro);
			return "sucesso";
			
		} catch (Exception e) {
			return "erro";
		}		
	}
	
	//action getListaLivros()
	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<>(Livro.class);
		return dao.listar();
	}
}

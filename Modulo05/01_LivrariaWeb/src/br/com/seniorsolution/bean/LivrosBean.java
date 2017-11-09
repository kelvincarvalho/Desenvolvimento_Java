package br.com.seniorsolution.bean;

import java.io.InputStream;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.UploadedFile;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Livro;

@ManagedBean(name="bLivro")
@RequestScoped
public class LivrosBean {
	
	@ManagedProperty(value="#{beanLivro}")
	private Livro livro;
	private UploadedFile part;
	
	/*public LivrosBean() {
		livro = new Livro();
	}*/
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public UploadedFile getPart() {
		return part;
	}
	public void setPart(UploadedFile part) {
		this.part = part;
	}
	
	//ACTION listarLivros()
	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<>(Livro.class);
		return dao.listar();
	}
	

	
	public String incluirLivro() {
		try {
			
			//RETORNA UM FLUXO DE BYTES
			InputStream inputStream = part.getInputstream();
			byte[] imagem = new byte[(int)part.getSize()];
			
			inputStream.read(imagem,0, (int)part.getSize());
			livro.setImagem(imagem);
			
			GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
			dao.adicionar(livro);
			return "sucesso";
			
			
		} catch (Exception e) {
			return "erro";
		}
		
	}
	
	
	
	
}

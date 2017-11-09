package br.com.seniorsolution.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Revisao;

@ManagedBean(name="bRevisao")
@RequestScoped
public class RevisaoBean {
	
	@ManagedProperty("#{beanRevisao}")
	private Revisao revisao;
	
	
	/*public RevisaoBean() {
		revisao = new Revisao();
	}*/

	public Revisao getRevisao() {
		return revisao;
	}

	public void setRevisao(Revisao revisao) {
		this.revisao = revisao;
	}

	public String incluirRevisao() {
		try {
				
			GenericDao<Revisao> dao = new GenericDao<Revisao>(Revisao.class);
			dao.adicionar(revisao);
			return "sucesso";
			
			
		} catch (Exception e) {
			return "erro";
		}
		
	}
	
	public void evento (ValueChangeEvent e){
		
		
	}

	
	
	
}

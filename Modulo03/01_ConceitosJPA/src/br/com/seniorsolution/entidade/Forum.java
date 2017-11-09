package br.com.seniorsolution.entidade;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forum")
public class Forum implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "IDFORUM")
	private int id;
	
	@Column(name = "ASSUNTO", length = 45)
	private String assunto;
	
	@Column(name="DESCRICAO", length = 45)
	private String descricao;
	
	//ENTIDADE 1 PRA MUITOS, MODELO CASCATA// //LAZY SO CARREGA A LISTA SE FOR NECESSARIO, EAGER CARREGA TUDO
	//LAZY É MELHOR COM RELAÇÃO A  DESEMPENHO E O MAIS ADEQUADO
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="forum") 
	private Set<Usuario> usuarios = new HashSet<>();
	
	
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	
}

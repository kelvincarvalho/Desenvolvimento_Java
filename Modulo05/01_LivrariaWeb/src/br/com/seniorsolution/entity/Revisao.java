package br.com.seniorsolution.entity;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="revisao")
@ManagedBean(name="beanRevisao")
@RequestScoped
public class Revisao implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
		@Id 
		@GeneratedValue
		@Column (name="ID")
		private int id;
		
		@Column (name="DATA")
		private Date data;
		
		@Column (name="DESCRICAO")
		private String descricao;
		
		@Column (name="RESPONSAVEL")
		private String responsavel;
		
		@Column (name="CODLIVRO")
		private int codlivro;
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		

		public String getResponsavel() {
			return responsavel;
		}

		public void setResponsavel(String responsavel) {
			this.responsavel = responsavel;
		}

		public int getCodlivro() {
			return codlivro;
		}

		public void setCodlivro(int codlivro) {
			this.codlivro = codlivro;
		}
		

	

}

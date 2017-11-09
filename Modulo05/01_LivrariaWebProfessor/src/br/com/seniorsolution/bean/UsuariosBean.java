package br.com.seniorsolution.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Usuario;

@ManagedBean(name="bUsuarios")
@SessionScoped
public class UsuariosBean {

	private Usuario usuario;

	public UsuariosBean() {
		usuario = new Usuario();
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String validarUsuario() {
		try {
			GenericDao<Usuario> dao = new GenericDao<>(Usuario.class);
			if(dao.validarUsuario(usuario.getNome(), usuario.getSenha()) != null) {			

				return "admin/menu?faces-redirect=true";
			} else {
				FacesContext context = FacesContext.getCurrentInstance();

				FacesMessage message = new FacesMessage();				
				message.setSummary("Erro Login: ");
				message.setDetail("Usuario ou senha inválidos");
				message.setSeverity(FacesMessage.SEVERITY_FATAL);
				
				context.addMessage(null, message);
				
				return "login";
			}
		} catch (Exception e) {
			return "admin/erro";
		}
	}
}

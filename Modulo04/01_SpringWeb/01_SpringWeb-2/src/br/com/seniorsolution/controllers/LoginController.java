package br.com.seniorsolution.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.seniorsolution.entidades.Usuario;
import br.com.seniorsolution.jdbc.JdbcLoginDao;

@Controller
public class LoginController {
	
	@RequestMapping("/usuario/validacao")
	public String iniciar() {
		return "login/validacao";
	}
	
	@RequestMapping(value="/validar", method=RequestMethod.POST)
	public String validar(Usuario usuario,String nome, String senha,HttpSession session, ModelMap model) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcLoginDao dao = (JdbcLoginDao) ctx.getBean("jdbcLoginDao");
			
			if(dao.validar(usuario.getNome(), usuario.getSenha()) != null) {
				session.setAttribute("user", usuario);
				return "pagina/menu";
			}
			else {
				return "pagina/erro";
			}

		} catch (Exception e) {
			model.addAttribute("mensagem", "USUÁRIO OU SENHA INCORRETOS");
			return "pagina/erro";
		}

	}
}

package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.seniorsolution.entidades.Disciplina;
import br.com.seniorsolution.entidades.Usuario;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcDisciplinaDao;
import br.com.seniorsolution.jdbc.JdbcLoginDao;
import br.com.seniorsolution.jdbc.JdbcUsuarioDao;

@Controller
public class UsuarioController {
	
	@RequestMapping("/usuario/cadastro")
	public String incluir() {
		
			return "cadastro/incluirUsuario";
		
	}
	

	@RequestMapping(value="/cadusuario", method=RequestMethod.POST)
	public String incluir(@Valid Usuario usuario,BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "forward:/usuario/cadastro";
		}
		
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcUsuarioDao dao = (JdbcUsuarioDao) ctx.getBean("jdbcUsuarioDao");
			dao.incluirUsuario(usuario);

			model.addAttribute("mensagem", "Usu�rio " + usuario.getNome() + " inclu�do com sucesso!");
			return "pagina/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "pagina/erro";
		}

	}
	
	
		
	
	
	
}

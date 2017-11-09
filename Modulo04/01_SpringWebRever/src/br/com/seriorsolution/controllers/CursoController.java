package br.com.seriorsolution.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class CursoController {
	
	@RequestMapping("/curso/cadastro")
	public String incluir(ModelMap model) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		
		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		
		try {
			model.addAttribute("escolas",dao.listarEscolas());
			return "cadastros/incluirCurso";
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "paginas/erro";
		}
		
		
	}
	
	@RequestMapping(value="/cadcurso", method=RequestMethod.POST)
	public String incluir(Curso curso, ModelMap model, int idescola) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			
			JdbcCursoDao dao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");
			dao.incluirCurso(curso, idescola);
			
			
			model.addAttribute("mensagem", "Curso "+ curso.getDescricao()+" incluida!!!");
			
			return "paginas/sucesso";
			
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "paginas/erro";
		}
		
	}
}

package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class CursoController {
	
	@RequestMapping("/curso/cadastro")
	public String incluir(ModelMap model) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		
		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		
		try {
			model.addAttribute("escolas", dao.listarEscolas());
			return "cadastro/incluirCurso";
		} catch (Exception e) {
			return "pagina/erro";
		}
	}
	@RequestMapping("/cadcurso")
	public String incluir(@Valid Curso curso,BindingResult result, int idescola, ModelMap model) {
		if(result.hasErrors()) {
			return "forward:/curso/cadastro";
		}
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcCursoDao dao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");
			dao.incluirCurso(curso, idescola);
			
			model.addAttribute("mensagem", "Curso "+ curso.getDescricao()+" inclu�do com sucesso!");
			return "pagina/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "pagina/erro";
		}
		
	}
	

}

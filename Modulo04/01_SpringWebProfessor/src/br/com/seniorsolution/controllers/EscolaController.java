package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class EscolaController {

	@RequestMapping("/escola/cadastro")
	public String incluir() {
		return "cadastros/incluirEscola";
	}
	
	@RequestMapping(value="/cadescola", method=RequestMethod.POST)
	public String incluir(Escola escola, ModelMap model, BindingResult result) {

		try {
			ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanJdbc.xml");
			
			JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
			dao.incluirEscola(escola);
			
			model.addAttribute("mensagem", "Escola " 
					+ escola.getDescricao() + " inclu�da.");
			
			return "paginas/sucesso";
			
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "paginas/erro";
		}
	}
	
	@RequestMapping("/escola/lista")
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView();
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcEscolaDao dao = (JdbcEscolaDao)ctx.getBean("jdbcEscolaDao");
			
			model.addObject("listaEscolas", dao.listarEscolas());
			model.setViewName("consultas/listarEscolas");
		} catch(Exception e) {
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");			
		}
		return model;
	}
	
	@RequestMapping("/escola/cursos")
	public ModelAndView listar(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcCursoDao dao = (JdbcCursoDao)ctx.getBean("jdbcCursoDao");
			
			
			model.addObject("listaCursos", dao.listarCursos(id));
			model.setViewName("consultas/listarCursos");
			
			
		} catch(Exception e) {
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");			
		}
		return model;
	}	
}

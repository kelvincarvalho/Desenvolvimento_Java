package br.com.seriorsolution.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Disciplina;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcDisciplinaDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class DisciplinaController {
		
		@RequestMapping("/disciplina/cadastro")
		public String incluir(ModelMap model) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			
			JdbcCursoDao dao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");
			
			try {
				model.addAttribute("escolas",dao.listarCursos());
				return "cadastros/incluirDisciplina";
			} catch (Exception e) {
				model.addAttribute("mensagem", e.getMessage());
				return "paginas/erro";
			}
			
			
		}
		
		@RequestMapping(value="/caddisciplina", method=RequestMethod.POST)
		public String incluir(Disciplina disciplina, ModelMap model, int idcurso) {
			try {
				ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
				
				JdbcDisciplinaDao dao = (JdbcDisciplinaDao) ctx.getBean("jdbcDisciplinaDao");
				dao.incluirDisciplina(disciplina, idcurso);
				
				
				model.addAttribute("mensagem", "Disciplina "+ disciplina.getDescricao()+" incluida!!!");
				
				return "paginas/sucesso";
				
			} catch (Exception e) {
				model.addAttribute("mensagem", e.getMessage());
				return "paginas/erro";
			}
			
		}
		
	
}

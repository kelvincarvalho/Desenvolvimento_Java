package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.seniorsolution.entidades.Disciplina;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcDisciplinaDao;

@Controller
public class DisciplinaController {

	@RequestMapping("/disciplina/cadastro")
	public String incluir(ModelMap model) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");

		JdbcCursoDao dao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");

		try {
			model.addAttribute("cursos", dao.listarCursos());
			return "cadastro/incluirDisciplina";
		} catch (Exception e) {
			return "pagina/erro";
		}
	}

	@RequestMapping("/caddisciplina")
	public String incluir(@Valid Disciplina disciplina,BindingResult result, int idcurso, ModelMap model) {
		if(result.hasErrors()) {
			return "forward:/disciplina/cadastro";
		}
		
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcDisciplinaDao dao = (JdbcDisciplinaDao) ctx.getBean("jdbcDisciplinaDao");
			dao.incluirDisciplina(disciplina, idcurso);

			model.addAttribute("mensagem", "Disciplina " + disciplina.getDescricao() + " incluído com sucesso!");
			return "pagina/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "pagina/erro";
		}

	}

}

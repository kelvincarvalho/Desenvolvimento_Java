package br.com.seniorsolution.controllers;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class EscolaController {
	
	@RequestMapping("/escola/cadastro")
	public String incluir() {
		return "cadastro/incluirEscola";
	}
	@RequestMapping(value="/cadescola", method=RequestMethod.POST)
	public String incluir(@Valid Escola escola, BindingResult result, ModelMap model ) {
		
		if(result.hasErrors()) {
			return "forward:/escola/cadastro";
		}
		try {
			ApplicationContext ctx = 
					new ClassPathXmlApplicationContext("beanJdbc.xml");
			
			JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
			dao.incluirEscola(escola);
			
			model.addAttribute("mensagem", "Escola "+ escola.getDescricao()+" inclu�da com sucesso!");
			return "pagina/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", e.getMessage());
			return "pagina/erro";
		}
	}

}

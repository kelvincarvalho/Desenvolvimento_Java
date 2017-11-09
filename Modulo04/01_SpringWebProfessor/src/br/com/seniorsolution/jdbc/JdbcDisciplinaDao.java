package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Disciplina;

public class JdbcDisciplinaDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	//propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//m�todo para incluir um novo curso
	public void incluirDisciplina(Disciplina disciplina) throws Exception{
		try {
			String sql = "INSERT INTO DISCIPLINA "
					+ "(IDCURSO,DESCRICAO,CH) VALUES (?,?,?)";
			jdbcTemplate.update(
					sql, 
					disciplina.getCurso().getId(),
					disciplina.getDescricao(),
					disciplina.getCh());
			
		} catch (Exception e) {
			throw e;
		}
	}	
}

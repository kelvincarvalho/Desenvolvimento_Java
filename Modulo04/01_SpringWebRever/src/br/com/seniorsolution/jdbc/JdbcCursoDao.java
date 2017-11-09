package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Curso;

public class JdbcCursoDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	//	propriedade dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
//	metodo para incluir um novo curso
	public void incluirCurso(Curso curso, int idescola) throws Exception{
		try {
			String sql = "INSERT INTO CURSO (IDESCOLA, DESCRICAO) VALUES (?,?)";
			this.jdbcTemplate.update(sql, 
								idescola, 
								curso.getDescricao());
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public List<Curso> listarCursos() throws Exception{
		List<Curso> cursos = new ArrayList<>();
		try {
			cursos = this.jdbcTemplate.query("SELECT * FROM CURSO", new CursoMapper());
		} catch (Exception e) {
			throw e;
		}		
		return cursos;
	}
}

package br.com.seniorsolution.jdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Disciplina;

public class JdbcDisciplinaDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void incluirDisciplina(Disciplina disciplina, int idcurso) throws Exception{
		try {
			String sql = "INSERT INTO DISCIPLINA (ID, DESCRICAO, CH, IDCURSO) VALUES (?,?,?,?)";
			this.jdbcTemplate.update(
					sql,
					disciplina.getId(),
					disciplina.getDescricao(),
					disciplina.getCh(),
					idcurso
					);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
}

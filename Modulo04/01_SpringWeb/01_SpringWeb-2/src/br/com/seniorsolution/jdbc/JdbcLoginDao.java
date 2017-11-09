package br.com.seniorsolution.jdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.entidades.Usuario;

public class JdbcLoginDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	//	propriedade dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Usuario validar(String nome, String senha) throws Exception {
		try {
			String sql = "SELECT * FROM USUARIO WHERE NOME=? AND SENHA=?";
			
			return this.jdbcTemplate.queryForObject(sql, new String[] {nome,senha},new UsuarioMapper());
		} 
		catch (Exception e) {
			throw e;
		}	
	}

}
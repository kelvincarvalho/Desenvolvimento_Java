package br.com.seniorsolution.jdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Usuario;

public class JdbcUsuarioDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	//	propriedade dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
//	metodo para incluir um novo usuario
	public void incluirUsuario(Usuario usuario) throws Exception{
		try {
			String sql = "INSERT INTO USUARIO (NOME, SENHA, NIVEL) VALUES (?,?,?)";
			this.jdbcTemplate.update(sql, usuario.getNome(),usuario.getSenha(), usuario.getNivel()); 
								
		} catch (Exception e) {
			throw e;
		}
	}
	
	
}

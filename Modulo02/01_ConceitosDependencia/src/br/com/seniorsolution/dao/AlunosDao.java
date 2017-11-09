package br.com.seniorsolution.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AlunosDao {

	//elementos de acesso a dados
	private Connection cn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public Connection getCn() {
		return cn;
	}
	public void setCn(Connection cn) {
		this.cn = cn;
	}
	public PreparedStatement getStmt() {
		return stmt;
	}
	public void setStmt(PreparedStatement stmt) {
		this.stmt = stmt;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	public void abrirConexao() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String conexao = "jdbc:mysql://localhost:3306/modulo02db";
		cn = DriverManager.getConnection(conexao, "root", "Imp@ct@");
	}
	public void fecharConexao() throws Exception{
		if(cn != null && !cn.isClosed()){
			cn.close();
		}
	}
	
	//m�todo para incluir um novo aluno
	public void incluirAluno(Aluno aluno) throws Exception{
		try {
			abrirConexao();
			String sql = "INSERT INTO ALUNO (MATRICULA, NOME, IDADE, SEXO) VALUES (?,?,?,?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			stmt.setInt(3, aluno.getIdade());
			stmt.setInt(4, aluno.getSexo().ordinal());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}	
	}
	
	
	//M�todo para buscar aluno com base na matricula
	public Aluno buscarAluno(int matricula) throws Exception{
		Aluno aluno = null;
		try {
			abrirConexao();
			String sql = "SELECT * FROM ALUNO WHERE MATRICULA = ?";
			
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, matricula);
			rs = stmt.executeQuery();
			if(rs.next()){
				aluno = new Aluno(rs.getString("NOME"), 
						rs.getInt("IDADE"), 
						rs.getInt("SEXO") == 0 ? Sexo.MASCULINO : Sexo.FEMININO , rs.getInt("MATRICULA"), null);
			}
			
			
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}
		return aluno;
	}
	
	//M�todo para incluir um novo curso
	public void incluirCurso(Curso curso, Aluno aluno) throws Exception{
		try {
			abrirConexao();
			String sql = "INSERT INTO CURSO (CODIGO, DESCRICAO, CARGAHORARIA, MATRICULA) VALUES (?,?,?,?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, curso.getCodigo());
			stmt.setString(2, curso.getDescricao());
			stmt.setInt(3, curso.getCargaHoraria());
			stmt.setInt(4, aluno.getMatricula());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}	
		
	}
	//metodo para listar todos os cursos
	public Set<Curso> listarCurso (Aluno aluno) throws Exception{
		Set<Curso> cursos = new LinkedHashSet<>();
		try {
			abrirConexao();
			String sql = "SELECT * FROM CURSO WHERE CODIGO = ?";
			stmt = cn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if(rs.next()){
				Curso curso = new Curso(rs.getInt("CODIGO"), rs.getString("DESCRICAO"), rs.getInt("CH"));
				cursos.add(curso);
			}
			
			
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}
		return cursos;
	}
	//metodo para listar todos os alunos
	public Set<Aluno> listarAlunos() throws Exception{
		Set<Aluno> alunos = new LinkedHashSet<>();
		try {
			abrirConexao();
			String sql = "SELECT * FROM ALUNO";
			stmt = cn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Aluno aluno = new Aluno(rs.getString("NOME"), rs.getInt("IDADE"), rs.getInt("SEXO") == 0 ? Sexo.MASCULINO : Sexo.FEMININO, rs.getInt("MATRICULA"), null);
				alunos.add(aluno);
			}
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}
		return alunos;
	}
	
}

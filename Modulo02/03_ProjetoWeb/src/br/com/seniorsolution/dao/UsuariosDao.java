package br.com.seniorsolution.dao;

public class UsuariosDao extends AlunosDao{
	
	public boolean validarUsuario(String usuario, String senha) throws Exception{
		boolean resposta = false;
		
		try {
			abrirConexao();
			setStmt(getCn().prepareStatement("SELECT * FROM USUARIO WHERE NOME = ? AND SENHA = ?"));
			getStmt().setString(1, usuario);
			getStmt().setString(2, senha);
			
			setRs(getStmt().executeQuery());
			
			resposta = getRs().next();
		} catch (Exception e) {
			throw e;
		} finally{
			fecharConexao();
		}
		
		return resposta;
	}

}

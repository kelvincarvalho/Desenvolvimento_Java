<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir Usuario</title>
</head>
<body>
<h1>Cadastre um usuario</h1>

<form action=<c:url value="/cadusuario"/> method="post">
	
	<label>Nome do Usu�rio</label><br/>
	<input type="text" name="nome"> <form:errors path="usuario.nome"/><br/><br/>
	
	<label>Senha do Usu�rio</label><br/>
	<input type="password" name="senha"><form:errors path="usuario.senha"/> <br/><br/>
	
	
	<label>Nivel de Acesso: </label><br/>
	<select name="nivel">
		<option value="Administradror">Nivel 1 - Administrador</option>
		<option value="Coordenador">Nivel 2 - Coordenador</option>
 		<option value="Professor">Nivel 3 - Professor</option>

	</select><br/><br/>
	
	
	<input type="submit" value="Incluir Usuario">
</form>
	${mensagem}

</body>
</html>
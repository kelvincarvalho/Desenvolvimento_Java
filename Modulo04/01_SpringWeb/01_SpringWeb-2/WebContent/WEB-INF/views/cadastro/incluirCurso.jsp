<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Curso</title>
</head>
<body>
<h1>Cadastre de Novos Cursos</h1>
<form action=<c:url value="/cadcurso"/> method="post">
	<label>Descri��o do Curso</label><br/>
	<input type="text" name="descricao"><form:errors path="curso.descricao"/> <br/>
	
	<label>Selecione a Escola: </label><br/>
	<select name="idescola">
		<c:forEach var="escola" items="${escolas}">
			<option value="${escola.id}">${escola.descricao}</option>
		</c:forEach>
	</select><br/>
	
	<input type="submit" value="Incluir Curso">
</form>
	${mensagem}

</body>
</html>
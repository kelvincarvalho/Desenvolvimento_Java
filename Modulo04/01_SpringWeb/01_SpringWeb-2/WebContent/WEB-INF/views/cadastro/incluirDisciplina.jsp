<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir Disciplina</title>
</head>
<body>
	<h1>Cadastre uma Nova Disciplina </h1>
	<form action=<c:url value="/caddisciplina"/> method="post">
		<label>Código da Disciplina</label><br/>
		<input type="text" name="id"/><form:errors path="disciplina.id"/><br/><br/>
		
		<label>Descrição</label><br/>
		<input type="text" name="descricao"/><form:errors path="disciplina.descricao"/> <br/><br/>
		
		<label>Carga Horária</label><br/>
		<input type="text" name="ch"/><form:errors path="disciplina.ch"/><br/><br/>
		
		<select name="idcurso">
		<c:forEach var="curso" items="${cursos}">
			<option value="${curso.id}">${curso.descricao}</option>
		</c:forEach>
		</select><br/><br/>

		<input type="submit" value="Incluir Disciplina">
	</form>
	
		${mensagem}
	
</body>
</html>
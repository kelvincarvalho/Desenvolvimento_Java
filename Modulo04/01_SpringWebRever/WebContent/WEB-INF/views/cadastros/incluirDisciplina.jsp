<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir Disciplina</title>
</head>
<body>
	<h1>Cadastre uma Nova Disciplina </h1>
	<form action=<c:url value="/caddisciplina"/> method="post">
		<label>C�digo da Disciplina</label><br/>
		<input type="text" name="id"/><br/>
		
		<label>Descri��o</label><br/>
		<input type="text" name="descricao"/><br/>
		
		<label>Carga Hor�ria</label><br/>
		<input type="text" name="ch"/><br/>
		
		<select name="idcurso">
		<c:forEach var="curso" items="${cursos}">
			<option value="${curso.id}">${curso.descricao}</option>
		</c:forEach>
		</select><br/>

		<input type="submit" value="Incluir Disciplina">
	</form>
	
		${mensagem}
	
</body>
</html>
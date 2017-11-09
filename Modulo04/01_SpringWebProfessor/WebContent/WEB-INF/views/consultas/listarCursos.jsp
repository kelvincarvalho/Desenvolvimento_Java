<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Cursos por Escola</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>DESCRI��O</th>
			<th>Op��es</th>
		</tr>

		<c:forEach var="curso" items="${listaCursos}">
			<tr>
				<td>${curso.id}</td>
				<td>${curso.descricao}</td>
				<td>
					<a href=<c:url value="/disciplina/cadastro?id=${curso.id}"/>>Incluir Disciplina</a> |
					<a href=<c:url value="/curso/disciplinas?id=${curso.id}"/>>Listar Disciplinas</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserido com sucesso</title>
</head>
<body>

	<h2>
	<p>
	${mensagem }
	</p>
	Selecione uma opção</h2>
	<ul>
		<li><a href=<c:url value="/"/> >Voltar para Menu Principal</a></li>
		<li><a href=<c:url value="/escola/cadastro"/> >Cadastrar novo curso</a></li>
	</ul>

</body>
</html>
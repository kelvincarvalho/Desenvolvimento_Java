<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="color: Blue">
		<h1>Parab�ns!</h1>
		<p>${mensagem}</p>

	</div>
	<a href=<c:url value="/escola/cadastro" />>Voltar para Cadastro</a>
	<br />
	<a href=<c:url value="/" />>Volta para o menu de op��es</a>
</body>
</html>
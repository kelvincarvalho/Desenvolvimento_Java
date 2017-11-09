<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserido com Sucesso</title>
</head>
<body>
	<div style="color: green">
	<h1>
	${mensagem}
	</h1>
	<a href=<c:url value="/escola/cadastro"/>>Voltar para a tela de cadastramento</a><br/>
	<a href=<c:url value="/"/>>Voltar para o menu principal</a><br/>
	</div>
</body>
</html>
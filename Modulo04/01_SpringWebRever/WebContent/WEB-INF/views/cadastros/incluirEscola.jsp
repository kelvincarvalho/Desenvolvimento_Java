<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Escola</title>
</head>
<body>
	<h1>Inclus�o - Nova Escola</h1>
	<form action=<c:url value="/cadescola"/> method="post">
		<label>Nome da Escola </label><br/>
		<input type="text"name="descricao" size="30"><br/>
		
		<label>Endereco </label><br/>
		<input type="text"name="endereco" size="30"><br/>
		
		<label>Data Funda��o (dd/MM/yyyy) </label><br/>
		<input type="text"name="dataString" size="30"></br></br>
		
		<input type="submit" value="Incluir Escola">
	</form>
	${mensagem}
	
</body>
</html>
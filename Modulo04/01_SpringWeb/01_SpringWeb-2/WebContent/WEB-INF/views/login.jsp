<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu de Op��es</title>
</head>
<body>

<h1>Efetuar Login</h1>

	<ul>
	<form action=<c:url value="/validar"/> method="post">
	
	<label>Username:      </label><br/>
	<input type="text" name="nome"><br/><br/>
	
	<label>Password</label><br/>
	<input type="password" name="senha"><br/><br/>
	
	
	<input type="submit" value="Entrar">
	</form>
	
	</ul>

</body>
</html>
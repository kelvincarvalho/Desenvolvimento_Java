<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Erro</title>
</head>
<body>
	
	<h1> Erro! </h1>
	<p>
		${mensagem}
	</p>
	<ul>
		<li><a href=<c:url value="/"/> >Menu Principal</a></li>

	</ul>
	
</body>
</html>
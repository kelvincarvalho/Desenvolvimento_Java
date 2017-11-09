<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestão de produtos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/estilos.css" />
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ include file="/WEB-INF/cabecalho/cabecalho.jsp" %>
	
	<c:choose>
		<c:when test="${param.opcao eq 'cadastro'}">
			<%@ include file="/WEB-INF/cabecalho/cadastro.jsp" %>
		</c:when>
		<c:when test="${param.opcao eq 'lista'}">
			<%@ include file="/WEB-INF/cabecalho/lista.jsp" %>
		</c:when>
		<c:otherwise>
			<%@ include file="/WEB-INF/cabecalho/introducao.jsp" %>
		</c:otherwise>
	</c:choose>

	<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
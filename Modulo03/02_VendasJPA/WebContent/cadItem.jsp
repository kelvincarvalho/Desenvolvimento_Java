<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Inclus�o de Itens ao Pedidos</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:useBean id="pedidosBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
	
	<h1>Inclus�o de Itens ao Pedido</h1>
	<form action="itens" method="post">
		
		<label for="pedido">Pedido:</label>
		
		<select name="pedido">
			<c:forEach var="item" items="${pedidosBean.listaPedidos }">
				<option value="${item.pedidoPK}">${item.pedidoPK} </option>
			</c:forEach>
		</select><br/><br/>
		
		<label>Quantidade: </label>
		<input type="text" name="quantidade" id="quantidade" maxlength="1000"/><br/><br/>
		
		<label>Decri��o: </label>
		<input type="text" name="descricao" id="descricao" size="25"/><br/><br/>
		
		
		<input type="submit" value="Incluir" style = "width:100px">
		
	</form>
	${mensagem}

</body>
</html>
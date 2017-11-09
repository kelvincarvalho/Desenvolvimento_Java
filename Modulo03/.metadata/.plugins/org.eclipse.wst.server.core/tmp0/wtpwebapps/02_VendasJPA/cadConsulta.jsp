<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Consulta</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:useBean id="beanVendas" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
	
	<h1>Consulta a Pedido e Itens</h1>
	<fieldset>
		
		<legend>Tipos de Consulta</legend>
		<form action="">
			<input type="radio" name="opcao" value="pedidos" cheked="checked">Pedidos por Cliente<br/>
			<input type="radio" name="opcao" value="itens" cheked="checked">Itens por Cliente<br/><br/>
		
		<label">Clientes:</label>
		
		<select name="pedido">
			<c:forEach var="item" items="${beanVendas.listaClientes}">
				<option value="${item.id}">${item.empresa }</option>
			</c:forEach>
		</select><br/><br/>
		
		<label">Pedidos:</label>
		
		<select name="pedido">
			<c:forEach var="item" items="${beanVendas.listaPedidos}">
				<option value="${item.pedidoPK}">${item.pedidoPK}</option>
			</c:forEach>
		</select><br/><br/>
		
		<input type="submit" value="Buscar" style = "width:100px">
		
		</form>
	${mensagem}
	
	</fieldset>
		
		
	

</body>
</html>
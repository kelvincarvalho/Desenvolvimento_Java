<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Pedidos - JSTL</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:useBean id="clienteBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
	
	<h1>Cadastro de Pedidos - JSTL</h1>
	<form action="pedidos" method="post">
		
		<label for="cliente">Cliente:</label>
		
		<select name="cliente">
			<c:forEach var="item" items="${clienteBean.listaClientes }">
				<option value="${item.id}">${item.empresa }</option>
			</c:forEach>
		</select><br/><br/>
		
		<label>Data: </label>
		<input type="text" name="dataPedido" id="dataPedido" maxlength="10" placeholder="dd/mm/yyyy"/><br/><br/>
		
		<label>Numero do Pedido: </label>
		<input type="text" name="numeropedido" id="numeropedido" size="25"/><br/><br/>
		
		<label>Categoria: </label>
		<select name="categoria">
 			<option value="alim">Alimentos</option>
			<option value="roupas">Roupas</option>
			<option value="games">Games</option>
			<option value="outros">Outros</option>
		</select><br/><br/>
		
		
		<input type="submit" value="Enviar" style = "width:100px">
		
	</form>
	${mensagem}

</body>
</html>
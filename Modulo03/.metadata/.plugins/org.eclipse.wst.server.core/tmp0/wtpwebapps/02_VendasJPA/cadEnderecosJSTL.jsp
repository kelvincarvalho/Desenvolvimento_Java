<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Endereços - JSTL</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:useBean id="clienteBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
	
	<h1>Cadastro de Endereços para Clientes - JSTL</h1>
	<form action="enderecos" method="post">
		
		<label for="cliente">Cliente:</label>
		
		<select name="cliente">
			<c:forEach var="item" items="${clienteBean.listaClientes }">
				<option value="${item.id}">${item.empresa }</option>
			</c:forEach>
		</select><br/><br/>
		
		<label>Rua: </label>
		<input type="text" name="rua" id="rua" size="25"/><br/><br/>
		
		<label>Cidade: </label>
		<input type="text" name="cidade" id="cidade" size="22"/><br/><br/>
		
		<label>CEP: </label>
		<input type="text" name="cep" id="cep" size="24"/><br/><br/>
		
		<input type="submit" value="Enviar">
		
	</form>
	${mensagem}

</body>
</html>
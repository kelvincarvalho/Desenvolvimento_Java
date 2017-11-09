<!DOCTYPE html>
<%@page import="br.com.seniorsolution.entidades.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="br.com.seniorsolution.dao.GenericDao"%>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Enderešos</title>
</head>
<body>
	<h1>Cadastro de Enderešos para Clientes</h1>
	<form action="enderecos" method="post">
		
		<label for="cliente">Cliente:</label>
		
		<%GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
		List<Cliente> clientes = dao.listar();
		%>
		
		<select name="cliente">
			<%for(Cliente item: clientes){ %>
			<option value="<%= item.getId() %>"><%= item.getEmpresa() %></option>
			<%} %>
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
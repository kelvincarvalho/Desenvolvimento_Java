<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Produtos - WebService (REST)</h1>
	<form>
		<input type="button" value="Acessar WebService" id="btnAcesso" />

		<ul id="lista"></ul>
	</form>

	<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		function getXmlHttpRequest(){
			if(window.XMLHttpRequest){
				return new XMLHttpRequest();
			} else {
				return new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		$(document).ready(function(){
			$("#btnAcesso").click(function(){
				var xmlhttp = getXmlHttpRequest();
				xmlhttp.open("GET", "http://localhost:8080/07_GestaoProdutos/wsjson", true);
				
				xmlhttp.onreadystatechange = function(){
					if(xmlhttp.readyState == 4){ //resposta completa
						if(xmlhttp.status == 200){ //Resposta OK
							var resposta = JSON.parse(xmlhttp.responseText);
						
							var lista = document.getElementById("lista");
							
							for (var i = 0; i < resposta.length; i++) {
								
								var item = document.createElement("li");
								
								item.textContent = resposta[i].codigo + ": " + 
										resposta[i].descricao;
								lista.appendChild(item);
							}
						} else {
							alert("Problemas ao recuperar resposta");
						}
					}
				};
				xmlhttp.send();				
			});
		});
	</script>
</body>
</html>

<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<style>
		table, tr, td, th{
			border: 1px solid #ccc;
			padding: 10px;
			margin: 10px;
		}
	</style>
</head>
<body ng-controller="Principal as ctl">
	
	<h2>Servi�o HTTP para listar Produtos</h2>
	
	<table>
		<tr>
			<th>CODIGO</th>
			<th>DESCRICAO</th>
			<th>PRE�O</th>
			<th>FABRICANTE</th>
		</tr>
		<tBODY ng-repeat="produto in ctl.items">
			<tr>
				<th>{{produto.codigo}}</th>
			<th>{{produto.descricao}}</th>
			<th>{{produto.preco}}</th>
			<th>{{produto.fabricante}}</th>
			</tr>
		</tBODY>
	</table>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
		angular.module("appAngular",[]).controller("Principal",["$http",function(){
		var self = this;
		
		self.items = [];
		
		$http.ge6t("url").then(function(response){
			self.items= response.data;
		}, function(error) {
			alert("Erro reportado: "+error);
		});
	}]);
	</script>
</body>
</html>

<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="Principal as ctl">
	<h2>Formularios: Modo Explicito</h2>
	<form ng-submit="ctl.submit1()">
		<input type="text" ng-model="ctl.nome" placeholder="Nome"/><br/>
		<input type="text" ng-model="ctl.curso" placeholder="Curso"/><br/>
		<input type="submit" value="Submit 1">
	</form><br/><br/>
	
	<h2>Formularios: Modo Implicito</h2>
	<form ng-submit="ctl.submit2()">
		<input type="text" ng-model="ctl.aluno.nome" placeholder="Nome"/><br/>
		<input type="text" ng-model="ctl.aluno.curso" placeholder="Curso"/><br/>
		<input type="submit" value="Submit 2">
	</form>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
	angular.module("appAngular",[]).controller("Principal",[function(){
		var self = this;
		//MODO EXPLICITO
		self.submit1 = function(){
			var aluno =  {nome: self.nome, curso: self.curso};
			alert("Dados do 1� Form: \n"+ aluno.nome+"\n"+aluno.curso);
		};
		
		//MODO IMPLICITO
		self.submit2 = function(){
			alert("Dados do 2� Form: \n"+ self.aluno.nome+"\n"+self.aluno.curso);
		};
		
	}]);
	</script>
</body>
</html>

<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="Principal as ctl">
	<h2>Lista de Alunos</h2>
	<div ng-repeat="aluno in ctl.alunos">
		Nome: {{aluno.nome}}<br/>
		Curso: {{aluno.curso}}<br/>	<br/>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
	angular.module("appAngular",[]).controller("Principal",[function(){
		var self = this;
		self.alunos = [
			{nome: "Kelvin Carvalho", curso: "Sistemas de Informa��o"},
			{nome: "Leonardo", curso: "ADS"},
			{nome: "Rubens", curso: "Biomedicina"}
		];
	}]);
	</script>
</body>
</html>
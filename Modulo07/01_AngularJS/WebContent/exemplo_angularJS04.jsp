
<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	
	<style>
	.finalizado{
		color: blue;
	}
	.pendente{
		color: red;
	}
	</style>
	
</head>
<body ng-controller="Principal as ctl">
	
		<h2>Lista de Alunos</h2>
	<div ng-repeat="aluno in ctl.alunos" ng-class="ctl.verificarStatus(aluno.status)">
		Nome: {{aluno.nome}}<br/>
		Curso: {{aluno.curso}}<br/>
		Status: {{aluno.status}}<br/><br/>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
	angular.module("appAngular",[]).controller("Principal",[function(){
			
		var self = this;
		self.alunos = [
			{nome: "Kelvin Carvalho", curso: "Sistemas de Informação", status:"Aprovado"},
			{nome: "Leonardo", curso: "ADS"},
			{nome: "Rubens", curso: "Biomedicina", status:"Reprovado"}
			
		];
		
		self.verificarStatus= function(status){
			return {
				finalizado: status !=null,
				pendente: status == null
			}
		};
			
	}]);
	</script>
</body>
</html>

<!DOCTYPE html>
<html ng-app="primeiroController">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo Controller</title>
</head>
<body ng-controller="Principal as ctl">
	
	Visualizar Mensagem: {{ctl.mensagem}}
	<br/>
	<button ng-click="ctl.alterarMensagem()">
		Alterar Mensagem
	</button>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
		angular.module("primeiroController",[]).controller("Principal",[function(){
			var self = this;
			self.mensagem = "Mensagem Original";
			self.alterarMensagem = function(){
				self.mensagem="Mensagem Alterada";
			}
		}]);
	</script>
</body>
</html>
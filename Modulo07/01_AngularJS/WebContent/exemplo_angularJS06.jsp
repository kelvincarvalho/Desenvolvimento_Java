
<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alguns Servicos</title>
</head>
<body ng-controller="Principal as ctl">
	<h2>Exemplo de Serviços Prontos</h2>
	<button ng-click="ctl.mostrarLog()">Mostrar Log</button>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
	//A ORDEM DOS PARAMENTROS NO CONTROLLER É IMPORTANTE
	//SEGUE A ORDEM DOS SERVIÇOS APRESENTADOS NA DEFINIÇÃO DO CONTROLLER
	angular.module("appAngular",[]).controller("Principal",["$location", "$window",
		function($location, $window){
		
		var self = this;
		self.mostrarLog = function(){
			var url = $location.url();
			var absUrl = $location.absUrl();
			var protocol = $location.protocol();
			
			var mensagem = "URL: "+url+"\n URL Absoluto: "+absUrl+"\n Protocolo: "+protocol;
			
			$window.alert(mensagem);
		};
		
	}]);
	</script>
</body>
</html>
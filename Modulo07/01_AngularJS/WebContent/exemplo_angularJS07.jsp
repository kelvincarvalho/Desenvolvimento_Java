
<!DOCTYPE html >
<html ng-app="appAngular">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="Principal">
	<h2>Usando service e factory</h2>
	
	<div>
		<p>Fornecer um Valor: <input type="number" ng-model="valor"/></p>
		<button ng-click="calcularQuadrado()">X<sup>2</sup> </button>
		<p>Resultado: {{resultado}}</p>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
	var appAngular = angular.module("appAngular",[]);
	
	//Factory: define um objeto e o disponibiliza
	appAngular.factory("MathFactory", function(){
		var factory = {};
		factory.multiplicar = function(a, b) {
			return a * b;
		};
		return  factory;
	});
	
	appAngular.service("MathService", function(MathFactory) {
		this.calcularQuadrado = function(a){
			return MathFactory.multiplicar(a,a);
		};
	})
	appAngular.controller("Principal",function($scope, MathService){
		$scope.calcularQuadrado = function () {
			$scope.resultado = MathService.calcularQuadrado($scope.valor);
		};
	});
	</script>
</body>
</html>
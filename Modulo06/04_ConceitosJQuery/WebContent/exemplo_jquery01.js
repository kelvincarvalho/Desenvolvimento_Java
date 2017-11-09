$(document).ready(function(){
	
	$("#botao").click (function() {
		var nome= $("#nome").val();
		var idade= $("#idade").val();
		
		var resultado = "Dados Cadastrais: "+"<br/> Nome: "+nome+"</br>Idade: "+idade;
		
		if(idade<18){
			resultado+="<br/> Voce é menor de idade";
		}
		else{
			resultado+="<br/> Voce é maior de idade";
		}
		
		$("#resultado").html(resultado);
	});
	
});
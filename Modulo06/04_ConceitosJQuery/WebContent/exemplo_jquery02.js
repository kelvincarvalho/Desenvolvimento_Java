$(document).ready(function() {
	var cursos = ["Java","PHP","HTML","PYTON"];
	
/*	for (var i = 0; i < cursos.length; i++) {
		$("#lista").append("<option value="+ i +">"+cursos[i]+"</option>");
	} 
*/
	$.each(cursos, function(indice, elemento) {
		$("#lista").append($("<option>", {
			value: indice, 
			text: elemento
		}));
	});
	
	$("#btn_enviar").click(function() {
		//OBTENDO O CONTEUDO
		var nome= $("#nome").val();
		var idade= $("#idade").val();
		var curso= $("#lista").val();
		
		var resultado;
		
		if ($("#resposta").hasClass("erro")) {
			$("#resposta").removeClass("erro");
		}
		
		if ($("#resposta").hasClass("ok")) {
			$("#resposta").removeClass("ok");
		}
		
		if(idade==""){
			resultado= "Idade Inválida!";
			$("#resposta").addClass("erro");
		}
		else{
			resultado = (idade < 18) ? "Menor de Idade" : "Maior de Idade";
			$("#resposta").addClass("ok");
		}
		$("#resposta").hide();
		$("#resposta").html(resultado);
		$("#resposta").fadeIn(3000);
		$("#resposta").fadeOut(3000);
		
	})
});
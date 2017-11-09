//ARRAY DE ESTADOS
var estados=[
	{"id": 1, "estado": "SP"},
	{"id": 2, "estado": "RJ"},
	{"id": 3, "estado": "MG"},
	{"id": 4, "estado": "BA"}
];

//ARRAY DE CIDADES
var cidades = [
	{"id": 1, "idestado": 1, "cidade": "CAMPINAS"},
	{"id": 2, "idestado": 1, "cidade": "SOROCABA"},
	{"id": 3, "idestado": 1, "cidade": "PRAIA GRANDE"},
	{"id": 4, "idestado": 2, "cidade": "NITEROI"},
	{"id": 5, "idestado": 2, "cidade": "CABO FRIO"},
	{"id": 6, "idestado": 2, "cidade": "ANGRA"},
	{"id": 7, "idestado": 3, "cidade": "BELO HORIZONTE"},
	{"id": 8, "idestado": 3, "cidade": "OURO PRETO"},
	{"id": 9, "idestado": 3, "cidade": "EXTREMA"},
	{"id": 10, "idestado": 4, "cidade": "SALVADOR"},
	{"id": 11, "idestado": 4, "cidade": "PORTO SERGURO"},
	{"id": 12, "idestado": 4, "cidade": "SASA"}
];

$(document).ready(function() {
	//PREENCHE O ELEMENTO <SELECT ID = "ESTADO"> COM OS ESTADOS//
	$.each(estados, function(i, estado) {
		$("#estado").append($("<option>", {
			value: estado.id,
			text: estado.estado
		}));
	});
	
	//DEFINIÇÃO DO EVENTO DE MUDANÇA DE POSIÇÃO DA LISTA DE ESTADOS
	$("#estado").change(function() {
		
		var idestado = $(this).val();
		
		var cidadesFiltradas = $.grep(cidades, function(e) {
			return e.idestado == idestado;
		});
		
		$("#cidade").html("<option>Selecione</option> ")
		$.each(cidadesFiltradas, function(i, cidade) {
			$("#cidade").append($("<option>", {
				value: cidade.id,
				text: cidade.cidade
			}));
		});
	});
});
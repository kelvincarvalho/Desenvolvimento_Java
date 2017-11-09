function exibir(){
	
	
	document.getElementById("Voce Clicou Aqui").innerHTML=mensagem;
}

var botao = document.getElementById("botao");
botao.addEventListener("click", exibir);

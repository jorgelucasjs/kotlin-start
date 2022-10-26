// controle de fluxo

fun main() {
    
	// if else simplificado
	var media = 5
	var result = if(media >= 6) "Aprovado" else "Reprovado"
	//println(result)
	 
	// ==== when ===
	val option = 2
	when(option){
		//combinando opcoes
		1,2 -> {
			println("Café Puro")
			println("Leite separado")
		}
		/*1 -> {
			println("Café com leite")
			println("Melhor opção da casa")
		}*/
		3 -> println("Chocolate quente")
		else -> {
			println("Nenhuma opção selecionada")
			println("selecionada uma opção ")
		}
	}
	 
	 
	// get the result 
	val option = 2
	val resultado =  when(option){
		1->"Café Puro"
		2 -> "Chocolate quente"
		else -> "Nenhuma opção selecionada"
	}
	
	println(resultado)
	 
	 
	
 }
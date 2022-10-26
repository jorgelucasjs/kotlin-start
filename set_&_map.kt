/*
 	Set -> não permite elementos duplicados, é mais rápido que o ArrayList,
    não matém a ordem dos elementos
    
    Map -> é uma implementação chave-valor
 */

fun main() {
	
	/*var itens = hashSetOf("a","b", "c", "c")
	for(item in itens){
		println(item)
	}*/
	  
	var map = hashMapOf(
		"urso" to "Animal que hiberna",
	  "cao"   to "Melhor amigo do homem"
	)
	
	map.put("passaro", "Gosta de voar")
	map.remove("passaro")
	
	// exibe valores
	for(item in map.values){
		 println(item)	
	}
	
	// exibe as chaves
	for(item in map.keys){
		 println(item)	
	}
	
  
  }
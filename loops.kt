// Null Safe 

fun main() {
 
	var number =  1
	while(number < 5){
		 println("Executado => $number")
		 number ++
	 }
	
	 
	 for(number in 1..10){
		  println("Executado => $number")
	 }
	 
	 // looping array
	  val postagens = arrayOf(
		  "Postagem 1",
		  "Postagem 2",
		  "Postagem 3",
		  "Postagem 4",
		  "Postagem 5",
	  )
	  
	  for(post in postagens){
		  println(post)
	  }
	  
	  // get indice
	  for((indice, post) in postagens.withIndex()){
		  println("$indice -> $post")
	  }
	
 }
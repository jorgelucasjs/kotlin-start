// Null Safe 

fun main() {
 
    var texto: String? = null
    texto = "Lucas"
    
    //println(texto?.length)
    //
    //o texto nao pode ser nullo
    println(texto!!.length)
    
    
   
}
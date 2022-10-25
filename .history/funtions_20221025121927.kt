fun displayMessage (name: String){
    println("Alerta, voce nao preencheu todos os dados! $name")
}

fun somar (num1: Int, num2: Int): Int{
    return num1 + num2
}

fun main() {
	displayMessage("Fulano de Tal")
    
    val result = somar(21, 9)
    
    println(result)

}
/*
 	Enum -> é um tipo de dados que consiste em um
    conjunto de constantes
 
 */

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido{
    var status: StatusPedido = StatusPedido.PROCESSANDO
}


fun main() {
	
    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO
    
    if(pedido.status == StatusPedido.PROCESSANDO){
        println("Pedido está sendo processando!")
    }else{
        println("Pedido foi aprovado")
    }


}
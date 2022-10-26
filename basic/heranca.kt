open class Animal {
    
    open fun dormir(){
        println("Dormir")
    }
    
    fun correr(){
        println("Correr")
    }
}


class Cao : Animal(){
    
    // added sobrescrita de metodo
    override fun dormir(){
        super.dormir()
        println("como cao!")
    }
    
    fun latir(){
        println("Latir")
    }
}

class Passaro : Animal(){}

fun main() {
	
   val cao = Cao()
   cao.dormir()
   cao.correr()
   cao.latir()
   
   /*val passaro = Passaro()
   passaro.dormir()*/


}
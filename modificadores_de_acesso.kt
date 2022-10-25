/*
 * private -> visivel apenas dentro da classe
 * protected -> funciona como o "private", mas é visivel em subclasses
 * public -> visivel em todo lugar, caso não seja definido é o padrao
 * iternal -> Lembra o public, mas sua visibilidade é restringida ap módulo, sendo então visivel dentro de um mesmo modulo*/

open class Animal{
    
    //private, protected, public
    protected var nome = "Marley"
    
    fun dormir(){
        println("Dormir")
    }
}

class Cao : Animal(){
    fun exibeNome(){
        println("Método exibe nome: $nome")
    }
}

fun main(){
    val cao = Cao()
    cao.exibeNome()
}
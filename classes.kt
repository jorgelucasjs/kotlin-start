class Casa {
    //propriedades
    var cor: String = ""
    
    //Metodos
    fun abrirJanela (){
        println("Abrir Janela")
    }
    
    fun abrirPorta (){
        println("Abrir Porta")
    }
    
    fun abrirCasa(){
        this.abrirJanela()
        this.abrirPorta()
    }

}

fun main() {
	
    val casa = Casa()
    casa.cor = "Varde"
    
    casa.abrirCasa()
    
    println(casa.cor)

}
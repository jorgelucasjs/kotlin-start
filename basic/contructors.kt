
// contrutor primario
class Casa /*(cor: String, vagasGaragem:Int )*/{
    
    //propriedades
    var cor: String
    var vagasGaragem: Int
    
    /* init{
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/
    
	// contrutor secundario
    constructor(cor: String, vagasGaragem:Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    
    //Metodos
    fun detalhesCasa(){
        println("A casa tem cor: $cor, vagas: $vagasGaragem")
    }
    
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
	
    val casa = Casa("Amarela", 2)
    casa.detalhesCasa()


}
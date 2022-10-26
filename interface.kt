interface Presidente{
    fun ganharEleicao()
}

open class Cidadao{
    fun direitosDeveres(){
        println("Todo cidadao tem direitos e deveres")
    }
}

class Obama : Cidadao(), Presidente{
    override fun ganharEleicao(){
        println("Ganhar Eleicao no EUA")
    }
}

class Jorge : Cidadao(), Presidente {
     override fun ganharEleicao(){
        println("Ganhar Eleicao em Angola")
    }
}


fun main() {
 	val jorge = Jorge()
    jorge.direitosDeveres()
    jorge.ganharEleicao()
    
    val obama = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
   
   
}
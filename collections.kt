/*
 Collections ou coleções -> são implementções de estruturas de dados
 	-List -> Imutavel, tamanho fixo,apenas para leitura
    -ArrayList -> Mutavel, sem tamanho fixo, pode adicionar ou remover
 */



fun main() {
	
    //var listItens = listOf("SP", "RJ", "MG")
    var listItens = arrayListOf("SP", "RJ", "MG")
    listItens[0] = "MA"
    listItens.add("BA")
    //listItens.remove("SP")
    //listItens.removeAt(2)
    //println(listItens.size)
    //println(listItens.isEmpty())
    println(listItens)
}
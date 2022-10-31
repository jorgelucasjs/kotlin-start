fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.0,
    )

    /*println("nome ${alex.nome}")
    println("cpx ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")*/


    val fran = Gerente("Fran", "12121-212-222", 2000.0, 1234)

    println("nome ${fran.nome}")
    println("cpx ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")


    if (fran.autentica(1234)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }
}


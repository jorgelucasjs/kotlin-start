fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank")

    println("====================== FUNCIONARIO ===========================")
    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.0,
    )
    println("nome ${alex.nome}")
    println("cpx ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")


    println("====================== GERENTE ===========================")
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

    println("====================== DIRETOR ===========================")
    val gui = Diretor("Gui", "12121-212-222", 4000.0, 2000.0, 4000)

    println("nome ${gui.nome}")
    println("cpx ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    if (fran.autentica(4000)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }
}


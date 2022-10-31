fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank")


    val contaCorrente: Conta = ContaCorrente(
        "Alex",
        1000
    )
    val contaPoupanca: Conta = ContaPoupanca(
        "Fran",
        10001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldo}")
    println("Saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}")
}


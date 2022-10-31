/*class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){

    override fun bonificacao(): Double{
        return super.bonificacao() + salario
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha === senha){
            return true
        }
        return false
    }
}*/

class Gerente : Funcionario {

    val senha: Int

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
    ) : super(
        nome = nome,
        cpf = cpf,
        salario = salario
    ) {
        this.senha = senha
    }

    //métodos
    override fun bonificacao(): Double{
        return super.bonificacao() + salario
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha === senha){
            return true
        }
        return false
    }

}
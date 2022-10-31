class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){

    override fun bonificacao(): Double{
        return super.bonificacao() + salario + plr
    }

    fun autentica(senha: Int): Boolean {

        if(this.senha === senha){
            return true
        }

        return false
    }
}
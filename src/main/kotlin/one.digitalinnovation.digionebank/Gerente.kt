package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
)   : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio() = salario * 0.12

    override fun login(): Boolean = "123qwe##" == senha
}
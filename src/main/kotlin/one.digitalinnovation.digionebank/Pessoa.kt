package one.digitalinnovation.digionebank

class Pessoa() {
    var nome:String = "Gabriel Correia"
    var cpf:String = "123.123.123.09"
    private set

    fun pessoaInfo() = "$nome CPF: $cpf"

}


fun main() {
    val gabriel = Pessoa()
    println(gabriel.pessoaInfo())
}
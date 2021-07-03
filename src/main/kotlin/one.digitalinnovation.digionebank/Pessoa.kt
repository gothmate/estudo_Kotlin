package one.digitalinnovation.digionebank

class Pessoa() {
    var nome:String = "Gabriel Correia"
    var cpf:String = "123.123.123.09"
}

fun main(){
    val gabriel = Pessoa()
    print("Nome: "+ gabriel.nome+ "\n")
    println("CPF: " + gabriel.cpf)
}
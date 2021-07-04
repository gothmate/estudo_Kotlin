package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.TesteAutentica

fun main() {
    val maria = Cliente(
        nome = "Maria Maciel",
        cpf = "147.258.369.99",
        clienteTipo = ClienteTipo.PF,
        senha = "123qwe@@"
    )
    println(maria)
    TesteAutentica().autentica(maria)
}
package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 1252)

    println(digiOneBank.nome)
    println(digiOneBank.agencia)
}

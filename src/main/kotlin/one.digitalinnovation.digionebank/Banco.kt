package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val agencia: Int,
    ){
    fun info() = "$nome - $agencia"
}
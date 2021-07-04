package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.*


fun main(){
    val gabriel = Analista("Gabriel", "123.456.123.00", 5280.0)
    ImprimeRelatorioFuncionario.imprime(gabriel)

    println("")

    val joseph = Gerente("Joseph", "321.645.987.90", 7530.0, senha = "123qwe##")
    ImprimeRelatorioFuncionario.imprime(joseph)
    TesteAutentica().autentica(joseph)

    println("")

    val maria = Cliente(
        nome = "Maria Maciel",
        cpf = "147.258.369.99",
        clienteTipo = ClienteTipo.PF,
        senha = "123qwe@@"
    )
    println(maria)
    TesteAutentica().autentica(maria)
}

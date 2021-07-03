package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario
import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente


fun main(){
    val gabriel = Analista("Gabriel", "123.456.123.00", 5280.0)
    ImprimeRelatorioFuncionario.imprime(gabriel)
    println("")
    val joseph = Gerente("Joseph", "321.645.987.90", 7530.0)
    ImprimeRelatorioFuncionario.imprime(joseph)
}

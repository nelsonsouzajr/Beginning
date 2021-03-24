package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria do Carmo",
        "123.456.789-11",5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)

}
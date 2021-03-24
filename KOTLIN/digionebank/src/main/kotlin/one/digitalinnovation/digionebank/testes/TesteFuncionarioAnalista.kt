package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("Joao Pedro",
        "123.456.789-11",2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)

}


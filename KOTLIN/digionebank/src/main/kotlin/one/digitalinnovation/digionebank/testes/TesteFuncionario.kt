package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val nelson = Pessoa(nome = "Nelson Souza", cpf = "123456")
    println(nelson.nome)
    println(nelson.cpf)

    val joao = Funcionario("Nelson Souza", "123.456.789-11", BigDecimal.valueOf(2800.00) )
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}
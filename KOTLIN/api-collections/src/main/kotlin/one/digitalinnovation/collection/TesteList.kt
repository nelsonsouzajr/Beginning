package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao",2400.0)
    val maria = funcionario("Maria",1600.0)
    val jose = funcionario("José",5000.0)

    val funcionarios = listOf(joao, jose, maria)
    funcionarios.forEach { println(it) }

    println("----------")
    println(funcionarios.find { it.nome == "José" })

    println("---------")
    funcionarios
            .sortedBy { it.salario}
            .forEach{ println(it) }


}

data class funcionario(
        val nome: String,
        val salario: Double
) {
    override fun toString(): String =
            """
                Nome:    $nome
                Salário: $salario
            """.trimIndent()
}
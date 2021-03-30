package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao",2400.0, "CLT")
    val maria = funcionario("Maria",1600.0,"PJ")
    val jose = funcionario("José",5000.0,"CLT")

    val funcionarios = listOf(joao, jose, maria)
    funcionarios.forEach { println(it) }

    println("----------")
    println(funcionarios.find { it.nome == "José" })

    println("---------")//organiza os funcionarios em ordem crescente do salario
    funcionarios
            .sortedBy { it.salario}
            .forEach{ println(it) }

    println("---------")//agrupa os funcionarios em pelo grupo de contratacao
    funcionarios
            .groupBy { it.tipo}
            .forEach{ println(it) }

}


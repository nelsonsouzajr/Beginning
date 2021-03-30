package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao",2400.0, "CLT")
    val maria = funcionario("Maria",1600.0,"PJ")
    val jose = funcionario("José",5000.0,"CLT")

    val funcionarios1 = setOf(joao, jose)
    val funcionarios2 = setOf(maria)


    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("----------------")
    val funcionarios3 = setOf(joao, jose, maria)
    val resultsubtracao = funcionarios3.subtract(funcionarios2)
    resultsubtracao.forEach { println(it) }

    println("----------------")
    val funcionarios4 = setOf(joao, jose, maria)
    val resultintersect = funcionarios4.intersect(funcionarios2)
    resultintersect.forEach { println(it) }


}
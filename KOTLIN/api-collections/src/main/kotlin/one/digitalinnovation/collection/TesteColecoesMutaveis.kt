package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao",2400.0, "CLT")
    val maria = funcionario("Maria",1600.0,"PJ")
    val jose = funcionario("José",5000.0,"CLT")


    val funcionarios = mutableListOf(joao, maria)
    println("------------LIST----------------")
    funcionarios.forEach{println(it)}


    println("----------------------------")
    funcionarios.add(jose)
    funcionarios.forEach{println(it)}

    println("----------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("----------- SET -----------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{println(it)}

    println("----------------------------")
    funcionarioSet.add(jose)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{println(it)}


    println("----------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{println(it)}
}
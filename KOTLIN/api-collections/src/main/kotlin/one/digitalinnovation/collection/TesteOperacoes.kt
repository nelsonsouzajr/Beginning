package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1400.0, 2750.0, 700.0 )

    for (salario in salarios){
        println(salario)
    }

    println("----------")

    println("Maior Salario: ${salarios.max()}")
    println("Menor Salario: ${salarios.min()}")
    println("Média Salarial: ${salarios.average()}")

    val salariosfiltromaior2500 = salarios.filter { it >2500.0 }
    println("----------")
    salariosfiltromaior2500.forEach{ println(it)}
}
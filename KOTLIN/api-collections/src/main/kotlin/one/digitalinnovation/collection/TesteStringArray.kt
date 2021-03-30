package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3) ("")
    nomes[0] = "Maria"
    nomes[1] = "Zé"
    nomes[2] = "Joao"

    for (nome in nomes){
        println(nome)
    }

    println("----------")
    nomes.sort()
    for (nome in nomes){
        println(nome)
    }
}
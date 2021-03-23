package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String =  "Nelson"
    var cpf: String =   "999.999.999-99"
    private set

}

fun main() {
    val nelson = Pessoa()

    println(nelson)
    println(nelson.nome)
    println(nelson.cpf)

}
